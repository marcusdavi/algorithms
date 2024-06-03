package algorithms.api.service.leetcode;

import algorithms.api.dto.ListNode;

public interface LeetCodeService {
    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * @param l1
     * @param l2
     */
    ListNode getSum(ListNode l1, ListNode l2);

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * @param number
     * @return
     */
    Boolean isPalindromeNumber(int number);

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     * @param numbers
     * @param target
     */
    int[] twoSum(int[] numbers, int target);
}
