/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Global Variable mindepth
    int minDepth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        // Soltuion using DFS
        if (root == null) {
         return 0;   
        }
        // dfs caall
		dfs(root, 1);
		return minDepth;
        
    }
    
	private void dfs(TreeNode root, int currDepth) {
		if (root == null){
             return;   
        }
		if (root.left == null  && root.right == null) {
			minDepth = Math.min(minDepth, currDepth);
			// finish traversal and return to main/solution
			return;
		}
        
		dfs(root.left, currDepth + 1);
		dfs(root.right, currDepth + 1);
	}
}
