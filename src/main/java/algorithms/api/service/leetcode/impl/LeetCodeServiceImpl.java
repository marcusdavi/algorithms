package algorithms.api.service.leetcode.impl;

import algorithms.api.dto.ListNode;
import algorithms.api.service.leetcode.LeetCodeService;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

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
