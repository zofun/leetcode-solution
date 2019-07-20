/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //这道题的描述是真的花里胡哨的
        //判断链表中是否存在环
        //最好使用线性的地址
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==Integer.MAX_VALUE){
                return true;
            }
            //对已经经历过的点做个标记
            temp.val=Integer.MAX_VALUE;
            temp=temp.next;
        }
        return false;
    }
}

