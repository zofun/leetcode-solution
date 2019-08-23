/*
 * @lc app=leetcode id=687 lang=java
 *
 * [687] Longest Univalue Path
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
    private int result=0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return result;
    }
    private int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper(node.left);
        int right=helper(node.right);
        left=(node.left!=null&&node.val==node.left.val)?1+left:0;
        right=(node.right!=null&&node.val==node.right.val)?1+right:0;
        result=Math.max(result, left+right);
        return Math.max(left,right);
    }
}

