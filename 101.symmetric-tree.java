/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        
       if(root==null){
           return true;
       }

       return isSymmetric(root.left,root.right);

        
    }

    private boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val==right.val){
            return isSymmetric(left.right,right.left)&&isSymmetric(left.left,right.right);
        }

        return false;
    }

    
}

