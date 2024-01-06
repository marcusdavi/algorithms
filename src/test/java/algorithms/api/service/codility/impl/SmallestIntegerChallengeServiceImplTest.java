package algorithms.api.service.codility.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.codility.impl.SmallestIntegerChallengeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class SmallestIntegerChallengeServiceImplTest {

	@InjectMocks
	private SmallestIntegerChallengeServiceImpl service;

	@Test
	public void testGetSmallestIntegerChallenge() {
		int[] params1 = { -1, 1, -2, 2 };
		assertEquals(-2, service.getSmallestIntegerChallenge(params1));

		int[] params2 = { -212, -999, 1, 2 };
		assertEquals(-999, service.getSmallestIntegerChallenge(params2));
	}

}
