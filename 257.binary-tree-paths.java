import java.util.*;
/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new LinkedList<String>();
            if(root == null) {
                return result;
            }
   
            findPaths(result,"",root);
            return result;
        }
   
        public void findPaths(List<String> result,String temp,TreeNode root) {
            if(root == null) {
                return;
            }
   
            if(root.left == null && root.right == null) {
                result.add(temp+Integer.toString(root.val));
                return;
            }
   
            findPaths(result,temp+Integer.toString(root.val)+"->",root.left);
            findPaths(result,temp+Integer.toString(root.val)+"->",root.right);
        }


}

