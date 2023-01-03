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
        ArrayList<String> ans = new ArrayList<>();
        if(root==null) return ans;
        path(root,"",ans);
        return ans;
    }
    private void path(TreeNode root, String s, ArrayList<String>ans){ 
        if(root.left==null && root.right==null) ans.add(s+root.val); // leaf node.
             if(root.left!=null){
                 path(root.left,s+root.val+"->",ans);
             }
             if(root.right!=null){
                 path(root.right,s+root.val+"->",ans);
             }
    }
}