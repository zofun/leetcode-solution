import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
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
    private List<Integer> result=new LinkedList<>();
    public List<Integer> preorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root){
        if(root==null){
            return;
        }
        result.add(root.val);
        for(Node n:root.children){
            helper(n);
        }
    }
}

