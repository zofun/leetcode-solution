

/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    public int diameterOfBinaryTree(TreeNode root) {
        //等价于求根节点左右两个子树深度之和
        maxDepth(root);
        return result;
        
    }

    private int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        result=Math.max(result, left+right);
        return Math.max(left, right)+1;


    }
}

