package algorithms.api.service.leetcode.impl;

import algorithms.api.dto.ListNode;
import algorithms.api.service.leetcode.LeetCodeService;

import java.math.BigInteger;

public class LeetCodeServiceImpl implements LeetCodeService {
    @Override
    public ListNode getSum(ListNode l1, ListNode l2) {

        BigInteger result =  getNumber(l1).add(getNumber(l2));

        String strResult = reverseString(String.valueOf(result));

        return createListNode(strResult.toCharArray());
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
