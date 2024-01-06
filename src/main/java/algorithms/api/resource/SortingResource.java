package algorithms.api.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import algorithms.api.service.searching.to.SortTO;
import algorithms.api.service.sorting.SortingService;

@RestController
@RequestMapping("/sorting")
public class SortingResource {

	private SortingService sortingService;

	@GetMapping("/bubble-sort")
	public SortTO getSmallestIntegerNotFound(int[] numbers) {
		return sortingService.applyBubbleSort(numbers);
	}

}
