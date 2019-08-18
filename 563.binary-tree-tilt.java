/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
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
    public int findTilt(TreeNode root) {
        helper(root);
        return result;
    }

    private int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        result+=Math.abs(left-right);
        //计算每个结点的左右子树和本身的和
        return root.val+left+right;
    }
}

