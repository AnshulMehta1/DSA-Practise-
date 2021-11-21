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
    public List<Integer> postorder(Node root) {
    var order = new ArrayList<Integer>();
	postorder(root, order);
	return order;
}

private void postorder(Node root, List<Integer> post) {
//     recursive dfs
	if (root == null)
		return;
    // ENhanced for loop
	for (var child : root.children)
        
		postorder(child, post);
	post.add(root.val);
        
    }
}
