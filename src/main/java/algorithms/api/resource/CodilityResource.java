package algorithms.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import algorithms.api.service.CodilityService;
import algorithms.api.service.codility.CleanedSquaresService;
import algorithms.api.service.codility.MaximumWaitTimeForACarService;

@RestController
@RequestMapping("/codility")
public class CodilityResource {
	
	@Autowired
	CodilityService service;
	
	@Autowired
	MaximumWaitTimeForACarService maximumWaitTimeForACarService;
	
	@Autowired
	CleanedSquaresService cleanedSquaresService;
	
	
	@GetMapping("/smallest-integer-not-found")
	public int getSmallestIntegerNotFound(int[] numbers) {
		return service.getSmallestIntegerNotFound(numbers);
	}
	
	@GetMapping("/binary-gap")
	public int getLongestBinaryGap(int number) {
		return service.getLongestBinaryGap(number);
	}
	
	@GetMapping("/smallest-integer-chalenge")
	public int getSmallestIntegerChallenge(int[] numbers) {
		return service.getSmallestIntegerChallenge(numbers);
	}
	
	@GetMapping("/cleaneds-squares")
	public int getCleaningRobot(String[] param) {
		return cleanedSquaresService.getCleanedSquares(param);
	}
	
	@GetMapping("/max-wait-time")
	public int getMaximumWaitTimeForACar(int[] cars, int dispenser1, int dispenser2, int dispenser3) {
		return maximumWaitTimeForACarService.getMaximumWaitTimeForACar(cars, dispenser1, dispenser2, dispenser3);
	}

}
