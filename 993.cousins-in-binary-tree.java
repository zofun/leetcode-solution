import java.util.HashMap;
import java.util.Map;


/*
 * @lc app=leetcode id=993 lang=java
 *
 * [993] Cousins in Binary Tree
 *
 * https://leetcode.com/problems/cousins-in-binary-tree/description/
 *
 * algorithms
 * Easy (51.91%)
 * Likes:    276
 * Dislikes: 19
 * Total Accepted:    26.5K
 * Total Submissions: 51K
 * Testcase Example:  '[1,2,3,4]\n4\n3'
 *
 * In a binary tree, the root node is at depth 0, and children of each depth k
 * node are at depth k+1.
 * 
 * Two nodes of a binary tree are cousins if they have the same depth, but have
 * different parents.
 * 
 * We are given the root of a binary tree with unique values, and the values x
 * and y of two different nodes in the tree.
 * 
 * Return true if and only if the nodes corresponding to the values x and y are
 * cousins.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * 
 * 
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
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
    //记录每一个节点的深度
    private Map<Integer,Integer> depth;
    //记录每一个节点的
    private Map<Integer,TreeNode> parent;
    public boolean isCousins(TreeNode root, int x, int y) {
        depth=new HashMap<Integer,Integer>();
        parent=new HashMap<Integer,TreeNode>();
        dfs(root, null);

        return (depth.get(x)==depth.get(y))&&(parent.get(x)!=parent.get(y));


    }
    private void dfs(TreeNode node,TreeNode par){
       if(node!=null){
            parent.put(node.val, par);
           depth.put(node.val,par==null?0:depth.get(par.val)+1);
           dfs(node.left, node);
           dfs(node.right, node);
       }
    }
}

