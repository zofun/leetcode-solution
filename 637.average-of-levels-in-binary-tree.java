import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;







/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
   
    public List<Double> averageOfLevels(TreeNode root) {
       
       List<Double> result=new LinkedList<>();
       Queue<TreeNode> q=new LinkedList<>();

       q.add(root);
       while(!q.isEmpty()){
            int count=q.size(); //本层的结点数
            double sum=0;
            for(int i=0;i<count;i++){
                TreeNode node=q.poll(); //取出对头
                sum+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            result.add(sum/count);
       }

       return result;

    }
   
}

