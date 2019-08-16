/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
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

    private int result=Integer.MAX_VALUE;
    private int cur=-1;
    public int getMinimumDifference(TreeNode root) {
        //利用二叉搜索树中序遍历将得到有序数组的性值
        inorder(root);
        return result;

        
    }

    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(cur!=-1){
            result=Math.min(result, root.val-cur);
        }

        cur=root.val;

        inorder(root.right);
    }
}

