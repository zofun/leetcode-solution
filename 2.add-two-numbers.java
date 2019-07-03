/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public  class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode temp = null;
		int sum = 0; 
		boolean carry = false;//进位标志
		int v1 = 0;
		int v2 = 0;
		for(;;) {
			if(l1 == null && l2 == null && carry == false) {
				break;
			}
			v1 = l1 == null ? 0 : l1.val;
			v2 = l2 == null ? 0 : l2.val;
			sum = v1 + v2;
			if(carry) {
				sum = sum + 1;
			}
			if(sum > 9) {
				sum = sum % 10;
				carry = true;
			}else {
				carry = false;
			}
			temp = new ListNode(sum);
			if(result == null) {
				result = temp;
			}else {
				append(result, temp);
			}
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null ) {
				l2 = l2.next;
			}
		}
		return result;
	}
		
	void append(ListNode node, ListNode newNode) {
		ListNode temp = node.next;
		if(temp == null) {
			node.next = newNode;
			return;
		}else {
			append(temp, newNode);
		}
	}
  

    
}

