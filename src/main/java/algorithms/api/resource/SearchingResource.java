package algorithms.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import algorithms.api.service.searching.SearchingService;
import algorithms.api.service.searching.to.SearchTO;

@RestController
@RequestMapping("/searching")
public class SearchingResource {
	
	@Autowired
	private SearchingService service;

	@GetMapping("/linear-search")
	public SearchTO getElementLinearSearch(int[] numbers, int element) {
		return service.getElementLinearSearch(numbers, element);
	}
	
	@GetMapping("/binary-search")
	public SearchTO getElementBinarySearch(int[] numbers, int element) {
		return service.getElementBinarySearch(numbers, element);
	}

}
