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
	//declare global tree - res
    TreeNode res;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        //Initialize the result 
        TreeNode curr = new TreeNode(0);
		//  Give it curr which is the root pointet
        res = curr;
		// Recursive call for helper Function
        helper(root);
        return curr.right;
    }
    public void helper(TreeNode root) {
        if(root==null){
            return;a
        }
         
        helper(root.left);
        res.right = new TreeNode(root.val);
        res = res.right;
        helper(root.right);
    }
}
