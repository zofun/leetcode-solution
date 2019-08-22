/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
    private long max;
    private long second=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        max=root.val;
        helper(root);
        return second==max||second==Long.MAX_VALUE?-1:(int)second;
    }

    private void helper(TreeNode node){
        if(node==null){
            return;
        }
        if (node.val != max && node.val < second) {
            second = node.val;
        }
        helper(node.left);
        helper(node.right);
    }
}

