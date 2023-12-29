package algorithms.api.service.codility.impl;

import org.springframework.stereotype.Service;

import algorithms.api.service.codility.SmallestIntegerChallengeService;

@Service
public class SmallestIntegerChallengeServiceImpl implements SmallestIntegerChallengeService {

	@Override
	public int getSmallestIntegerChallenge(int[] numbers) {
		int ans = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (ans > numbers[i]) {
				ans = numbers[i];
			}
		}
		return ans;
	}

}