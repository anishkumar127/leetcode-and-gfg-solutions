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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     if(q == null && p == null){
            return true;
        }
        else if( q == null || p == null){
            return false;
        }
        if( q.val == p.val){
           return isSameTree(q.left,p.left) && isSameTree(q.right, p.right);
        }
        return false;

    }
}