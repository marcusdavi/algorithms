package algorithms.api.service.sorting.impl;

import algorithms.api.service.searching.to.SortTO;
import algorithms.api.service.sorting.SortingService;

public class SortingServiceImpl implements SortingService {

	@Override
	public SortTO applyBubbleSort(int[] numbers) {
		int steps = 0;
		int i, j, temp;
		boolean swapped = true;
		int length = numbers.length;

		while (swapped) {
			swapped = false;
			for (i = 0; i < length - 1; i++) {
				for (j = 0; j < length - i - 1; j++) {
					steps++;
					if (numbers[j] > numbers[j + 1]) {
						temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
						swapped = true;
					}
				}
			}
		}
		return new SortTO(steps, numbers);
	}

}
