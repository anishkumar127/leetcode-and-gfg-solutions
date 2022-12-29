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
    public boolean isValidBST(TreeNode root) {
       return validBST(root,(long)Integer.MAX_VALUE,(long)Integer.MIN_VALUE);
    }
    boolean validBST(TreeNode root,long mx,long mn){
        if(root == null){
            return true;
        }
        
        boolean values =  root.val<=mx && root.val>=mn;
        boolean left = validBST(root.left,(long)root.val-1,mn);
        boolean right = validBST(root.right,mx,(long)root.val+1);
        return values && left && right;

    }}