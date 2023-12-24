package algorithms.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import algorithms.api.service.CodilityService;

@RestController
@RequestMapping("/codility")
public class CodilityResource {
	
	@Autowired
	CodilityService service;
	
	@GetMapping("/getSmallestIntegerNotFound")
	public int getSmallestIntegerNotFound(int[] params) {
		return service.getSmallestIntegerNotFound(params);
	}
	
	@GetMapping
	public int getLongestBinaryGap(int number) {
		return service.getLongestBinaryGap(number);
	}

}
