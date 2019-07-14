import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //就是按层遍历
        //难搞哦
        //使用队列的方式来按层级遍历
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        List<List<Integer>> result=new ArrayList<>();

        Stack<List<Integer>> stack=new Stack<List<Integer>>();

        if(root!=null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                //从队列中取出第一个元素而不删除
                TreeNode node=queue.peek();
                if(node.left!=null){
                  //将该结点的左结点入队列
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offer(node.right);
                }

                //取出队首元素并删除
                list.add(queue.poll().val);
            }
            //为实现逆序输出采用栈来实现
           stack.push(list);

        }

        while(!stack.isEmpty()){
            result.add(stack.pop());
        }

        return result;


        
       
        
    }

   
}

