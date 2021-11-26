/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        return root == null ? 0 : maxD(root, 1);
        
    }
    private int maxD(Node node, int depth) {
	if (node == null){
        return depth;
    }
    var maxDepth = depth;
	for (var child : node.children)
		maxDepth = Math.max(maxD(child, depth + 1), maxDepth);
	return maxDepth;
    }
}
