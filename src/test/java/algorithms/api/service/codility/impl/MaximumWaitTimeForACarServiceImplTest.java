package algorithms.api.service.codility.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.codility.impl.MaximumWaitTimeForACarServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MaximumWaitTimeForACarServiceImplTest {

	@InjectMocks
	private MaximumWaitTimeForACarServiceImpl service;

	@Test
	public void getMaximumWaitTimeForACar() {
		int[] A = { 2, 8, 4, 3, 2 };

		assertEquals(8, service.getMaximumWaitTimeForACar(A, 7, 11, 3));
		assertEquals(-1, service.getMaximumWaitTimeForACar(A, 1, 1, 0));

		int[] B = { 4, 5, 6, 7 };
		assertEquals(6, service.getMaximumWaitTimeForACar(B, 10, 5, 20));
		assertEquals(4, service.getMaximumWaitTimeForACar(B, 20, 5, 10));
		assertEquals(-1, service.getMaximumWaitTimeForACar(B, 10, 11, 12));

	}

}
