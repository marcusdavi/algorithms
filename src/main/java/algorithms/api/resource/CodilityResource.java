package algorithms.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import algorithms.api.service.codility.BinaryGapService;
import algorithms.api.service.codility.CleanedSquaresService;
import algorithms.api.service.codility.MaximumWaitTimeForACarService;
import algorithms.api.service.codility.SmallestIntegerChallengeService;
import algorithms.api.service.codility.SmallestIntegerNotFoundService;

@RestController
@RequestMapping("/codility")
public class CodilityResource {

	@Autowired
	BinaryGapService binaryGapService;

	@Autowired
	SmallestIntegerChallengeService smallestIntegerChallengeService;

	@Autowired
	MaximumWaitTimeForACarService maximumWaitTimeForACarService;

	@Autowired
	SmallestIntegerNotFoundService smallestIntegerNotFoundService;

	@Autowired
	CleanedSquaresService cleanedSquaresService;

	@GetMapping("/smallest-integer-not-found")
	public int getSmallestIntegerNotFound(int[] numbers) {
		return smallestIntegerNotFoundService.getSmallestIntegerNotFound(numbers);
	}

	@GetMapping("/binary-gap")
	public int getLongestBinaryGap(int number) {
		return binaryGapService.getLongestBinaryGap(number);
	}

	@GetMapping("/smallest-integer-chalenge")
	public int getSmallestIntegerChallenge(int[] numbers) {
		return smallestIntegerChallengeService.getSmallestIntegerChallenge(numbers);
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
