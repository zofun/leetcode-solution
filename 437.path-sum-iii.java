/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int findPath(TreeNode root, int sum) {
        int result = 0;
        if (root == null) {
            return result;
        }
        if (sum == root.val) {
             result++;
        }
        result += findPath(root.left, sum-root.val);
        result += findPath(root.right, sum-root.val);
        return result;
    }
}

