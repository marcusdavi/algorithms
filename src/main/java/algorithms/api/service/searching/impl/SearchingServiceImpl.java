package algorithms.api.service.searching.impl;

import algorithms.api.service.searching.SearchingService;
import algorithms.api.service.searching.to.SearchTO;

public class SearchingServiceImpl implements SearchingService {

	@Override
	public SearchTO getElementLinearSearch(int[] numbers, int element) {
		int countSteps = 0;
		boolean founded = false;

		for (int number : numbers) {
			countSteps++;
			if (number == element) {
				founded = true;
				break;
			}
		}

		return new SearchTO(founded, countSteps, element, numbers.length);
	}

	@Override
	public SearchTO getElementBinarySearch(int[] numbers, int element) {
		int countSteps = 0;
		boolean founded = false;

		int lowerBound = 0;
		int upperBound = numbers.length - 1;

		while (lowerBound <= upperBound && !founded) {
			countSteps++;

			int midPoint = (upperBound + lowerBound) / 2;
			int valueMidPoint = numbers[midPoint];

			if (element == valueMidPoint) {
				founded = true;
			} else if (element < valueMidPoint) {
				upperBound = midPoint - 1;
			} else if (element > valueMidPoint) {
				lowerBound = midPoint + 1;
			}

		}

		return new SearchTO(founded, countSteps, element, numbers.length);
	}

}
