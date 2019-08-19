import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    private List<Integer> result=new LinkedList<Integer>();
    public List<Integer> postorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root){
        if(root==null){
            return;
        }
        for(Node n:root.children){
            helper(n);
        }
        result.add(root.val);
    }
}

