import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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

    Set set=new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);
    }

    private boolean helper(TreeNode root,int k){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return helper(root.left, k)||helper(root.right, k);
    }
}

