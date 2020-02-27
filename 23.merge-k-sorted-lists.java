import java.nio.file.FileAlreadyExistsException;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 *
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 *
 * algorithms
 * Hard (36.14%)
 * Likes:    3793
 * Dislikes: 245
 * Total Accepted:    553.2K
 * Total Submissions: 1.4M
 * Testcase Example:  '[[1,4,5],[1,3,4],[2,6]]'
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * Example:
 * 
 * 
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode tmpHead=new ListNode(0);
        ListNode cur=tmpHead;
       
        int min=0;
        int index=0;
        int nullListCount=0;
        boolean flag=false;
        //直到所有链表的所有节点都被合并了
        while(nullListCount<lists.length){
            nullListCount=0;
            min=Integer.MAX_VALUE;
            //首先遍历一遍，找到最小值
           
            flag=false;
            for(int i=0;i<lists.length;i++){
                ListNode node=lists[i];
                //遇到空链表就跳过
                if(node==null){
                    //统计空链表的数量
                    nullListCount++;
                    continue;
                }
                if(node.val<min){
                    min=node.val;
                    index=i;
                    flag=true;
                }
            }
            if(flag){
                //合并
                cur.next=lists[index];
                cur=cur.next;
                //头节点后移
                lists[index]=lists[index].next;
            }
           

        }
        return tmpHead.next;
        

        
    }
}


// @lc code=end

