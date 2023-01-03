/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val == p.val || root.val == q.val){
         return root;   
        }
        
        TreeNode left =lowestCommonAncestor(root.left , p ,q );
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        // result
        if(left==null)
            return right;
       else if(right==null)
            return left;
        else  // if both not null then we found our result
        return root;
    }
}