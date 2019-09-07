/*
 * @lc app=leetcode id=897 lang=java
 *
 * [897] Increasing Order Search Tree
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
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;

    }

    private void inorder(TreeNode node) {
        if (node == null){
            return;
        }
        inorder(node.left);
        //将当前结点作为右子树结点
        node.left=null;
        cur.right=node;
        //游标后移
        cur=node;
        inorder(node.right);
    }
}

