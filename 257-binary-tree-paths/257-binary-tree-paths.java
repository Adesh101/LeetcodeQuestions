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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        dfs(root, sb, paths);
        return paths;
    }
    
    public void dfs(TreeNode root, StringBuilder sb, List<String> paths){
        if(root == null)
            return;
        
        int len = sb.length();
        sb.append(root.val);
        
        if(root.left == null && root.right == null){
            paths.add(sb.toString());
        }
        else{
            sb.append("->");
            dfs(root.left, sb, paths);
            dfs(root.right, sb, paths);
        }
        sb.setLength(len);
    }
}