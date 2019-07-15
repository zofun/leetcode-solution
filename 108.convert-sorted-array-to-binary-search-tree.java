
/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }

    private TreeNode convert(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        //计算子数组的中间元素的下标
        int mid=left+(right-left)/2;
        //生成新的结点
        TreeNode treeNode=new TreeNode(nums[mid]);
        treeNode.left=convert(nums, left, mid-1);
        treeNode.right=convert(nums, mid+1, right);
        return treeNode;
    }
}

