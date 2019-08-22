/*
 * @lc app=leetcode id=669 lang=java
 *
 * [669] Trim a Binary Search Tree
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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null){
            return null;
        }
        if(root.val<L){
            //根结点小于L,则其左子树也都小于L
            //抛弃所有的左子树，只修剪右子树
            return trimBST(root.right, L, R);
        }else if(root.val>R){
            return trimBST(root.left, L, R);
        }else{
            root.left=trimBST(root.left, L, R);
            root.right=trimBST(root.right, L, R);
            return root;
        }
    }
}

