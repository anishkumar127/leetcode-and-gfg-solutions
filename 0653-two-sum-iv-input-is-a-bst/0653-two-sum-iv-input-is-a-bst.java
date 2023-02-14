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
    private void inOrder(TreeNode root, ArrayList<Integer>ans){
        if(root==null) return ;
        
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    public boolean findTarget(TreeNode root, int k) {
       ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        
        int s =0;
        int e = ans.size()-1;
        
        while(s<e){
            int sum = ans.get(s) + ans.get(e);
            if(sum==k) return true;
            else if(sum<k) s++;
            else e--;
        }
        return false;
    }

}