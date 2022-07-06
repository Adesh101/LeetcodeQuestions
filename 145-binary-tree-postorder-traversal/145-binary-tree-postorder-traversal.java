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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> postorder = new ArrayList<Integer>();
        
        if(root == null)
            return postorder;
        
        st1.push(root);
        
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null)
                st1.push(root.left);
            if(root.right != null)
                st1.push(root.right);
        }
        
        while(!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }
}