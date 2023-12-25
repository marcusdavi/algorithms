package algorithms.api.service.impl;

import org.springframework.stereotype.Service;

import algorithms.api.service.codility.CleanedSquaresService;

@Service
public class CleanedSquaresServiceImpl implements CleanedSquaresService {

	@Override
	public int getCleanedSquares(String[] R) {
		int lenRow = R.length;
		int lenCol = R[0].length();

		if (R.length == 1) {
			char[] charArray = R[0].toCharArray();
			if (charArray[0] == '.') {
				return 1;
			} else {
				return 0;
			}

		}

		// Create Grid
		String[][] grid = new String[lenRow][lenCol];

		for (int i = 0; i < lenRow; i++) {
			char[] charR = R[i].toCharArray();
			for (int j = 0; j < lenCol; j++) {
				grid[i][j] = charR[j] == '.' ? "empty" : "occupied";
			}
		}

		boolean inLoop = false;
		int repeat = 0;
		String[] directions = { "right", "down", "left", "up" };
		String atualDirection = directions[0];
		int i = 0;
		int j = 0;

		// Cleaning
		while (!inLoop) {
			switch (atualDirection) {
			case "right":
				if (j + 1 == lenCol || grid[i][j + 1] == "occupied") {
					atualDirection = directions[1];
				} else if (grid[i][j + 1] == "empty") {
					grid[i][j] = "cleaned";
					j++;
					repeat = 0;
				} else if (grid[i][j + 1] == "cleaned") {
					if (repeat == 1) {
						inLoop = true;
					} else {
						grid[i][j] = "cleaned";
						j++;
						repeat++;
					}

				}
				break;

			case "down":
				if (i + 1 == lenRow || grid[i + 1][j] == "occupied") {
					atualDirection = directions[2];
				} else if (grid[i + 1][j] == "empty") {
					grid[i][j] = "cleaned";
					i++;
					repeat = 0;
				} else if (grid[i + 1][j] == "cleaned") {
					if (repeat == 1) {
						inLoop = true;
					} else {
						grid[i][j] = "cleaned";
						i++;
						repeat++;
					}

				}
				break;

			case "left":
				if (j - 1 < 0 || grid[i][j - 1] == "occupied") {
					atualDirection = directions[3];
				} else if (grid[i][j - 1] == "empty") {
					grid[i][j] = "cleaned";
					j--;
					repeat = 0;
				} else if (grid[i][j - 1] == "cleaned") {
					if (repeat == 1) {
						inLoop = true;
					} else {
						grid[i][j] = "cleaned";
						j--;
						repeat++;
					}
				}
				break;

			case "up":
				if (i - 1 < 0 || grid[i - 1][j] == "occupied") {
					atualDirection = directions[0];
				} else if (grid[i - 1][j] == "empty") {
					grid[i][j] = "cleaned";
					i--;
					repeat = 0;
				} else if (grid[i - 1][j] == "cleaned") {
					if (repeat == 1) {
						inLoop = true;
					} else {
						grid[i][j] = "cleaned";
						i--;
						repeat++;
					}
				}
				break;
			}
		}

		// count cleaned squares
		int cleanedSquares = 0;

		for (int x = 0; x < lenRow; x++) {
			for (int z = 0; z < lenCol; z++) {
				if (grid[x][z] == "cleaned") {
					cleanedSquares++;
				}
			}
		}

		return cleanedSquares;
	}
}