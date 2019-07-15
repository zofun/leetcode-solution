

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {
       //判断高度是否平衡

       if(root==null){
           return true;
       }
       if(root.left!=null&&root.right!=null){
           int heightDif=getTreeHeight(root.left)-getTreeHeight(root.right);
           if(heightDif==-1||heightDif==1||heightDif==0){
                return isBalanced(root.left)&&isBalanced(root.right);
           }else{
               return false;
           }
       }else if(root.left!=null){
           return getTreeHeight(root.left)>1?false:true;
       }else if(root.right!=null){
           return getTreeHeight(root.right)>1?false:true;
       }else{
           return true;
       }
    }


    private int getTreeHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left)+1, getTreeHeight(root.right)+1);
    }
}

