package algorithms.api.service.searching.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.searching.to.SearchTO;

@RunWith(MockitoJUnitRunner.class)
public class SearchingServiceImplTest {

	@InjectMocks
	private SearchingServiceImpl service;

	int[] params1 = criarArray(1000);
	int[] params2 = criarArray(10000);
	int[] params3 = criarArray(100000);

	@Test
	public void testLinearSearching() {

		System.out.println("----linear Search----");

		// best-case
		SearchTO response = service.getElementLinearSearch(params1, 1);
		assertEquals(true, response.isFounded());
		System.out.println(response);

		// worst-case

		response = service.getElementLinearSearch(params1, -1);
		assertEquals(false, response.isFounded());
		System.out.println(response);

		response = service.getElementLinearSearch(params1, 1000);
		assertEquals(true, response.isFounded());
		System.out.println(response);

		response = service.getElementLinearSearch(params3, 100000);
		assertEquals(true, response.isFounded());
		System.out.println(response);

	}

	@Test
	public void testBinarySearch() {

		System.out.println("----Binary Search----");

		// best-case
		SearchTO response = service.getElementBinarySearch(params1, 500);
		assertEquals(true, response.isFounded());
		System.out.println(response);

		response = service.getElementBinarySearch(params1, -1);
		assertEquals(false, response.isFounded());
		System.out.println(response);

		response = service.getElementBinarySearch(params1, 1000);
		assertEquals(true, response.isFounded());
		System.out.println(response);

		// worst-case
		response = service.getElementBinarySearch(params3, 100000);
		assertEquals(true, response.isFounded());
		System.out.println(response);
	}

	private int[] criarArray(int length) {
		int[] numeros = new int[length];

		// Preenchendo o array com números de 1 a 1000
		for (int i = 0; i < length; i++) {
			numeros[i] = i + 1;
		}
		return numeros;
	}

}
