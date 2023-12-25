package algorithms.api.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CleanedSquaresServiceImplTest {

	@InjectMocks
	private CleanedSquaresServiceImpl service;

	@Test
	public void testGetCleanedSquares() {
		String[] A = { "...X..", "....XX", "..X..." };

		assertEquals(6, service.getCleanedSquares(A));

		String[] B = { "....X..", "X......", ".....X.", "......." };

		assertEquals(15, service.getCleanedSquares(B));

		String[] C = { "...X.", ".X..X", "X...X", "..X.." };

		assertEquals(9, service.getCleanedSquares(C));

		String[] D = { "...X.", "XXXXX", "X...X", "..X.." };
		assertEquals(3, service.getCleanedSquares(D));

		String[] E = { ".X.....", ".......", ".......", "..X.X..", "X.....X" };
		assertEquals(4, service.getCleanedSquares(E));

		String[] F = { "...", "...", "..." };
		assertEquals(8, service.getCleanedSquares(F));

		String[] G = { "...", "..." };
		assertEquals(6, service.getCleanedSquares(G));
	}

}
