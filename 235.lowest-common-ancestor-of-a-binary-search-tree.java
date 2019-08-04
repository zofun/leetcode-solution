/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null||p==root||q==root){
            return root;
        }

       if((p.val<root.val&&q.val>root.val)||(q.val<root.val&&p.val>root.val)){
           return root;
       }

       
       if(p.val<root.val&&q.val<root.val){
           //都在左子树
           return lowestCommonAncestor(root.left, p, q);
       }else{
           //都在右子树
           return lowestCommonAncestor(root.right, p, q);
       }

        
    }
}

