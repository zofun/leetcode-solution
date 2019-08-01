/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        } 
        //添加一个头结点，方便处理
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode cur = head;
        ListNode pre = dummy;
        
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = pre.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;

        
    }
}

