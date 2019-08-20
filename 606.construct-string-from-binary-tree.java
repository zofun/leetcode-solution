/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
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
    private StringBuffer sb=new StringBuffer();
    public String tree2str(TreeNode t) {
        helper(t);
        if(sb.length()==0){
            return sb.toString();
        }
        sb=sb.deleteCharAt(0);
        sb=sb.deleteCharAt(sb.length()-1);
        return sb.toString();
        
    }
    private void helper(TreeNode t){
        if(t==null){
            return;
        }
        sb.append("("+t.val);
        if(t.left==null&&t.right!=null){
            sb.append("()");
        }
        helper(t.left);
        helper(t.right);
        sb.append(")");
    }
}

