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
    public int rangeSumBST(TreeNode root, int low, int high) {
           
        int sum = 0;
        // Iterative Stack approach
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        // Pushing the root
        stack1.push(root);
        // Iterating 
        while(!stack1.isEmpty())
        {
            
            TreeNode popped = stack1.pop();
            // Iterating over left side of tree
            if(popped.left !=null){
              stack1.push(popped.left);  
            } 
            // Iterating right deptth 
            if(popped.right !=null){
              stack1.push(popped.right);  
            } 
            
            if(popped.val<=high && popped.val>=low)
            {
                sum += popped.val;
                
            }
          
        }
            
        
        return sum;
    }
}
