package algorithms.api.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import algorithms.api.service.CodilityService;

@Service
public class CodilityServiceImpl implements CodilityService {

	@Override
	public int getSmallestIntegerNotFound(int[] params) {
		int result = 1;

		Set<Integer> numbers = new HashSet<>();

		for (int n : params) {
			if (n > 0)
				numbers.add(n);
		}

		if (!numbers.isEmpty()) {
			int index = 1;
			boolean notFounded = false;

			while (!notFounded) {
				if (numbers.contains(index)) {
					index++;
				} else {
					notFounded = true;
					result = index;
				}
			}
		}

		return result;
	}

	@Override
	public int getLongestBinaryGap(int number) {

		String binaryNumberStr = "";

		while (number >= 1) {
			binaryNumberStr = String.valueOf(number % 2) + binaryNumberStr;
			number = number / 2;
		}

		if (StringUtils.isEmpty(binaryNumberStr)) {
			return 0;
		}

		int actualBinaryGap = 0;
		int maxLongestBinaryGap = 0;
		boolean init = false;
		char[] bynaryNumber = binaryNumberStr.toCharArray();

		for (int i = 0; i < bynaryNumber.length; i++) {

			if (bynaryNumber[i] == '1' && !init) {
				init = true;

			} else if (bynaryNumber[i] == '1' && init) {
				init = true;
				maxLongestBinaryGap = actualBinaryGap > maxLongestBinaryGap ? actualBinaryGap : maxLongestBinaryGap;
				actualBinaryGap = 0;
			}

			else if (bynaryNumber[i] == '0' && init) {
				actualBinaryGap++;
			}

		}

		return maxLongestBinaryGap;
	}

}
