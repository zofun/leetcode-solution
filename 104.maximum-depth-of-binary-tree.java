/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {

        //递归大法真的好用
        if(root==null){
            return 0;
        }else{
            if(root.left!=null&&root.right!=null){
                return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
            }else if(root.left!=null){
                return maxDepth(root.left)+1;
            }else{
                return maxDepth(root.right)+1;
            }
            
        }
        
    }
}

