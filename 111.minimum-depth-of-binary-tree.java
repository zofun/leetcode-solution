
/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        //求最低深度，和求最大高度差不多
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
           return 1;
        }
        int leftDepth=minDepth(root.left)+1;
        int rightDepth=minDepth(root.right)+1;
        
        leftDepth=leftDepth==1?Integer.MAX_VALUE:leftDepth;
        rightDepth=rightDepth==1?Integer.MAX_VALUE:rightDepth;

        return Math.min(leftDepth,rightDepth);
        
        
    }
}

