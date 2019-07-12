/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp=head;
        if(temp==null){
            return  null;
        }
        while(temp.next!=null){

            if(temp.val==temp.next.val){
                //删除下一个结点
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }

        return head;
        
    }
}

