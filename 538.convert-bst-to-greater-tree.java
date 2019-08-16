/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
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


    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }

    private void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.right);
        root.val+=sum;
        sum=root.val;
        helper(root.left);
    }
}

