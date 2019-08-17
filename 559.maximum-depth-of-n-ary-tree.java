import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
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
    public int maxDepth(Node root) {
        if(root == null) return 0 ;
        int res = 0;
        
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int levelNum = queue.size();
			res++;
			for(int i = 0;i<levelNum;i++) {
				Node tmp = queue.poll();
				if(tmp.children!=null) {
					List<Node> child = tmp.children;
					for(Node ele:child) queue.add(ele);
				}
			}
		}
		return res;
    }
}

