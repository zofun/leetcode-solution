import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
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
    List<Integer> nodes=new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        helper(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nodes.size()-1;i++){
            int diff=nodes.get(i+1)-nodes.get(i);
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }

    private void helper(TreeNode node){
       if(node==null){
           return;
       }
        helper(node.left);
        nodes.add(node.val);
        helper(node.right);
    }
}

