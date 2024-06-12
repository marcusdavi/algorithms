package algorithms.api.service.leetcode.impl;

import algorithms.api.dto.ListNode;
import algorithms.api.service.leetcode.LeetCodeService;

import java.math.BigInteger;
import java.util.*;

public class LeetCodeServiceImpl implements LeetCodeService {
    @Override
    public ListNode getSum(ListNode l1, ListNode l2) {

        BigInteger result = getNumber(l1).add(getNumber(l2));

        String strResult = reverseString(String.valueOf(result));

        return createListNode(strResult.toCharArray());
    }

    @Override
    public Boolean isPalindromeNumber(int number) {
        return number>= 0 && String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());
    }

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    @Override
    public int permutationDifference(String s, String t) {
        char[] arrayS = s.toCharArray();
        int result = 0;

        for(int i = 0; i < arrayS.length; i++){
            result += Math.abs(i - t.indexOf(arrayS[i]));
        }

        return result;
    }

    @Override
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();

        for(int i=0;i < expected.length-1;i++){
            for(int j=i+1;j<expected.length;j++){
                if(expected[i] > expected[j]){
                    int aux = expected[i];
                    expected[i] = expected[j];
                    expected[j] = aux;
                }
            }
        }
        int result = 0;
        for(int i=0;i < expected.length;i++){
            if(heights[i] != expected[i]){
                result++;
            }
        }

        return result;
    }

    @Override
    public int removeElement(int[] nums, int val) {
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    @Override
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index=0;

        for (int k : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == k) {
                    result[index] = (arr1[j]);
                    index++;
                    arr1[j] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for (int j : arr1) {
            if (j != -1) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }

    @Override
    public int[] sortColors(int[] nums) {
        for(int i=0; i < nums.length - 1; i++){
            for(int j=i+1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    int aux = nums[j];
                    nums[j] = nums[i];
                    nums[i] = aux;
                }
            }
        }
        return nums;
    }

    @Override
    public int removeDuplicates(int[] nums) {
        Set<Integer> result = new HashSet<>();

        for (int i=0; i< nums.length ;i++){
            if(result.contains(nums[i])){
                nums[i] = 1000;
            } else {
                result.add(nums[i]);
            }
        }

        Arrays.sort(nums);

        return result.size();
    }

    private BigInteger getNumber(ListNode ln){
        StringBuilder strNumber = new StringBuilder();

        do {
            strNumber.append(ln.val);
            ln = ln.next;
        }
        while(ln != null);

        return new BigInteger(reverseString(strNumber.toString()));
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static ListNode createListNode(char[] values) {
        if (values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(Character.getNumericValue(values[0]));
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(Character.getNumericValue(values[i]));
            current = current.next;
        }

        return head;
    }

}
