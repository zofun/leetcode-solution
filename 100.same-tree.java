import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //递归思路
        if(p==null&&q==null){
            return true;
        }

        if(p!=null&&q!=null){
            if(p.val==q.val){
                if(isSameTree(p.left, q.left)){
                    if(isSameTree(p.right, q.right)){
                        return true;
                    }
                }
            }
           
        }

        return false;
       




    }

 
}

