package algorithms.api.service.leetcode.impl;

import algorithms.api.dto.ListNode;
import algorithms.api.service.searching.to.SortTO;
import algorithms.api.service.sorting.impl.SortingServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

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
