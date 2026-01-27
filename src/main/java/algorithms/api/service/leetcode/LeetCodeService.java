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

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     *
     * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
     *
     * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * @param nums
     * @param val
     * @return k
     */
    int removeElement(int[] nums, int val);

    /**
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
     *
     * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
     * @param arr1
     * @param arr2
     * @return int[]
     */
    int[] relativeSortArray(int[] arr1, int[] arr2);

    /**
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     *
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *
     * You must solve this problem without using the library's sort function.
     * @param nums
     * @return
     */
    int[] sortColors(int[] nums);

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     *
     * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
     *
     * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * @param nums
     * @return
     */
    int removeDuplicates(int[] nums);

    /**
     * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     *
     * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
     *
     * Return the maximum number of words that appear in a single sentence.
     * @param sentences
     * @return
     */
    int maximumNumberOfWordsFoundInSentences(String[] sentences);

    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * @param haystack
     * @param needle
     * @return
     */
    int findTheIndexOfTheFirstOccurrenceInAString(String haystack, String needle);

    int searchInsertPosition(int[] nums, int target);

    int mySqrtWithoutFunction(int x);

    int[] plusOne(int[] ints);
}
