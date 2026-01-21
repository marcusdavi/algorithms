package algorithms.api.resource;

import algorithms.api.dto.ListNode;
import algorithms.api.service.leetcode.LeetCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leetcode/problems")
public class LeetCodeResource {

	@Autowired
	LeetCodeService service;

	@GetMapping("/add-two-numbers")
	public ListNode getSmallestIntegerNotFound(ListNode l1, ListNode l2) {
		return service.getSum(l1, l2);
	}

	@GetMapping("/palindrome-number")
	public Boolean getSmallestIntegerNotFound(int number) {
		return service.isPalindromeNumber(number);
	}

	@GetMapping("/tow-sum")
	public int[] getSmallestIntegerNotFound(int[] numbers, int target) {
		return service.twoSum(numbers, target);
	}

	@GetMapping("/permutation-difference-between-two-strings")
	public int permutationDifference(String s, String t) {
		return service.permutationDifference(s, t);
	}

	@GetMapping("/height-checker")
	public int heightChecker(int[] heights) {
		return service.heightChecker(heights);
	}

	@GetMapping("/remove-element")
	public int removeElement(int[] nums, int val) {
		return service.removeElement(nums,val);
	}

	@GetMapping("/relative-sort-array")
	public int[] relativeSortArray(int[] array1, int[] array2) {
		return service.relativeSortArray(array1,array2);
	}

	@GetMapping("/sort-colors")
	public int[] sortColors(int[] nums) {
		return service.sortColors(nums);
	}

	@GetMapping("/remove-duplicates-from-sorted-array")
	public int removeDuplicates(int[] nums) {
		return service.removeDuplicates(nums);
	}

	@GetMapping("/maximum-number-of-words-found-in-sentences")
	public int maximumNumberOfWordsFoundInSentences(String[] sentences) {
		return service.maximumNumberOfWordsFoundInSentences(sentences);
	}

	@GetMapping("/find-the-index-of-the-first-occurrence-in-a-string")
	public int maximumNumberOfWordsFoundInSentences(String haystack, String needle) {
		return service.findTheIndexOfTheFirstOccurrenceInAString(haystack, needle);
	}

	@GetMapping("/search-insert-position")
	public int searchInsert(int[] nums, int target) {
		return service.searchInsertPosition(nums, target);
	}
}
