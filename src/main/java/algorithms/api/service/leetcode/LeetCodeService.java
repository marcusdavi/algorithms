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

    /**
     * You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.
     *
     * The permutation difference between s and t is defined as the sum of the absolute difference between the index of the occurrence of each character in s and the index of the occurrence of the same character in t.
     *
     * Return the permutation difference between s and t.
     * @param s
     * @param t
     */
    int permutationDifference(String s, String t);

    /**
     * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
     *
     * You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
     *
     * Return the number of indices where heights[i] != expected[i].
     * @param heights
     */
    int heightChecker(int[] heights);
}
