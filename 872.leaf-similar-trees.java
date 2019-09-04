import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //判断两个二叉树叶子结点序列是否相同
        List<Integer> seqA=new LinkedList<Integer>();
        List<Integer> seqB=new LinkedList<Integer>();
        dfs(root1, seqA);
        dfs(root2, seqB);
        if(seqA.size()!=seqB.size()){
            return false;
        }
        for(int i=0;i<seqA.size();i++){
            if(seqA.get(i)!=seqB.get(i)){
                return false;
            }
        }
        return true;
        
    }

    private void dfs(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            list.add(root.val);
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }
}

