package algorithms.api.service.searching;

import algorithms.api.service.searching.to.SearchTO;

public interface SearchingService {

	SearchTO getElementLinearSearch(int[] numbers, int element);

	SearchTO getElementBinarySearch(int[] numbers, int element);

}
