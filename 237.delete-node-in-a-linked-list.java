/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
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
    public void deleteNode(ListNode node) {
        //交换待删除的结点与其后结点的值
        //然后再删除其后的结点
        //将后一个结点的值保存在当前结点
        node.val=node.next.val;
        node.next=node.next.next;


      
        
    }
}

