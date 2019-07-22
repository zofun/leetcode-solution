import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //一个规律是两个链表相交后，齐后所有结点均相等
        //所以先计算出链表长度差，然后让长链表走过找个长度差
        //然后两条链表同时遍历，知道找到相等的结点，即第一个相交的结点
        
        ListNode tempA=headA;
        ListNode tempB=headB;
        int lena=0;
        int lenb=0;
        while(tempA!=null){
            lena++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenb++;
            tempB=tempB.next;
        }

        
        tempA=headA;
        tempB=headB;
        if(lenb>lena){
            int dif=lenb-lena;
            for(int i=0;i<dif;i++){
                tempB=tempB.next;
            }
        }else{
            int dif=lena-lenb;
            for(int i=0;i<dif;i++){
                tempA=tempA.next;
            }
        }

        while(tempA!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }


        return null;
    }
}

