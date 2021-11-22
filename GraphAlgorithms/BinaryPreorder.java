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
    public List<Integer> preorderTraversal(TreeNode root) {
        // Recursive PreOrder Traversal
        List ans = new ArrayList<>();
        recursetraversal(root, ans);
        return ans;
        
    }
    private static void recursetraversal(TreeNode node,  List ans ){
        if( node == null){
            return; 
        }
           
        ans.add(node.val);
        recursetraversal(node.left, ans);
        recursetraversal(node.right, ans);
    }
}
