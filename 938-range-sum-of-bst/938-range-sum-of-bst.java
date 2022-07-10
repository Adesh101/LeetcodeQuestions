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
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int sum = 0;
        stack.push(root);
        
        if(root == null)
            return sum;
        
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            
            if(n == null)
                continue;
            
            if(n.val>low)
                stack.push(n.left);
            
            if(n.val<high)
                stack.push(n.right);
            
            if(n.val>=low && n.val<=high)
                sum += n.val;
        }
        return sum;
    }
}