package algorithms.api.service.sorting.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import algorithms.api.service.sorting.impl.SortingServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.searching.to.SortTO;

@RunWith(MockitoJUnitRunner.class)
public class SortingServiceImplTest {

	@InjectMocks
	private SortingServiceImpl service;

	@Test
	public void bubbleSort() {

		int[] numbers5 = { 3, 2, 1, 5, 4 };

		SortTO response = service.applyBubbleSort(numbers5);
		System.out.println(response.getReport());

		assertEquals(1, response.getArray()[0]);
		assertEquals(2, response.getArray()[1]);
		assertEquals(3, response.getArray()[2]);
		assertEquals(4, response.getArray()[3]);
		assertEquals(5, response.getArray()[4]);

		int[] numbers10 = {2, 6, 1, 7, 5, 4, 3, 8, 10, 9 };

		response = service.applyBubbleSort(numbers10);
		System.out.println(response.getReport());

		assertEquals(1, response.getArray()[0]);
		assertEquals(2, response.getArray()[1]);
		assertEquals(3, response.getArray()[2]);
		assertEquals(4, response.getArray()[3]);
		assertEquals(5, response.getArray()[4]);
		assertEquals(6, response.getArray()[5]);
		assertEquals(7, response.getArray()[6]);
		assertEquals(8, response.getArray()[7]);
		assertEquals(9, response.getArray()[8]);
		assertEquals(10, response.getArray()[9]);

	}

}
