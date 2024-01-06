package algorithms.api.service.codility.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.codility.impl.SmallestIntegerNotFoundServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class SmallestIntegerNotFound {

	@InjectMocks
	private SmallestIntegerNotFoundServiceImpl service;

	@Test
	public void testGetSmallestIntegerNotFound() {

		int[] params1 = { 1, 2, 3, 4, 6 };
		assertEquals(5, service.getSmallestIntegerNotFound(params1));

		int[] params2 = { -1, -2, -3, -4 };
		assertEquals(1, service.getSmallestIntegerNotFound(params2));

		int[] params3 = { 5, 6, 1, 2, 2, -1 };
		assertEquals(3, service.getSmallestIntegerNotFound(params3));
	}
}
