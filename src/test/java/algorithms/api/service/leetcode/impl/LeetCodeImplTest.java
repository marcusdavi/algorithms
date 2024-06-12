package algorithms.api.service.leetcode.impl;

import algorithms.api.dto.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LeetCodeImplTest {

	@InjectMocks
	private LeetCodeServiceImpl service;

	@Test
	public void addTwoNumbersScenario01() {
		ListNode l1 = createList(2, 4, 3);
		ListNode l2 = createList(5, 6, 4);

		ListNode result = service.getSum(l1, l2);

		assertEquals(7, result.val);
		assertEquals(0, result.next.val);
		assertEquals(8, result.next.next.val);

	}

	@Test
	public void addTwoNumbersScenario02() {
		ListNode l1 = createList(0);
		ListNode l2 = createList(0);

		ListNode result = service.getSum(l1, l2);

		assertEquals(0, result.val);
	}

	@Test
	public void addTwoNumbersScenario03() {
		ListNode l1 = createList(9, 9, 9, 9, 9, 9);
		ListNode l2 = createList(9, 9, 9, 9);

		ListNode result = service.getSum(l1, l2);

		assertEquals(8, result.val);
		assertEquals(9, result.next.val);
		assertEquals(9, result.next.next.val);

	}

	@Test
	public void isPalindromeNumber() {
		assertEquals(true, service.isPalindromeNumber(121));
		assertEquals(false, service.isPalindromeNumber(250));
		assertEquals(true, service.isPalindromeNumber(1213121));
		assertEquals(false, service.isPalindromeNumber(-123));

	}

	@Test
	public void relativeSortArray() {
		int[] array1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
		int[] array2 = new int[]{2,1,4,3,9,6};
		int[] result = new int[]{2,2,2,1,4,3,3,9,6,7,19};

		int[] response = service.relativeSortArray(array1, array2);

		for(int i=0; i<response.length; i++){
			assertEquals(result[i], response[i]);
		}

		array1 = new int[]{28,6,22,8,44,17};
		array2 = new int[]{22,28,8,6};
		result = new int[]{22,28,8,6,17,44};

		response = service.relativeSortArray(array1, array2);

		for(int i=0; i<response.length; i++){
			assertEquals(result[i], response[i]);
		}


	}

	@Test
	public void addTwoNumbers() {
		int[] result = service.twoSum(new int[]{2, 7, 11, 15}, 9);
		assertEquals(0, result[0]);
		assertEquals(1, result[1]);

		result = service.twoSum(new int[]{3, 2, 4}, 6);
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);

		result = service.twoSum(new int[]{3, 3}, 6);
		assertEquals(0, result[0]);
		assertEquals(1, result[1]);
	}

	@Test
	public void permutationDifference() {
		assertEquals(2, service.permutationDifference("abc", "bac"));
		assertEquals(12, service.permutationDifference("abcde", "edbac"));
	}

	@Test
	public void removeDuplicates() {
		assertEquals(2, service.removeDuplicates(new int[]{1, 1, 2}));
		assertEquals(5, service.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}

	@Test
	public void heightChecker() {
		assertEquals(3, service.heightChecker(new int[]{1,1,4,2,1,3}));
		assertEquals(5, service.heightChecker(new int[]{5,1,2,3,4}));
		assertEquals(0, service.heightChecker(new int[]{1,2,3,4,5}));
	}

	@Test
	public void maximumNumberOfWordsFoundInSentences(){
		assertEquals(6, service.maximumNumberOfWordsFoundInSentences(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}));
		assertEquals(3, service.maximumNumberOfWordsFoundInSentences(new String[]{"please wait","continue to fight","continue to win"}));

	}

	@Test
	public void removeElement() {
		assertEquals(2, service.removeElement(new int[]{3,2,2,3}, 3));
		assertEquals(5, service.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
	}

	@Test
	public void sortColors() {
		int [] result = new int[]{0,1,2};
		int [] response = service.sortColors(new int[]{2,0,1});

		for(int i=0; i<response.length; i++){
			assertEquals(result[i], response[i]);
		}

		result = new int[]{0,0,1,1,2,2};
		response = service.sortColors(new int[]{2,0,2,1,1,0});

	}

	private static ListNode createList(int... values) {
		if (values.length == 0) {
			return null;
		}

		ListNode first = new ListNode(values[0]);
		ListNode current = first;

		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}

		return first;
	}

}
