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
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode> helper_Stack = new Stack<>();
        helper_Stack.push(root);
        
        while(!helper_Stack.isEmpty()){
            root = helper_Stack.pop();
            ans.add(root.val);
            if(root.right!=null) helper_Stack.push(root.right);
            if(root.left!=null) helper_Stack.push(root.left);
        }


        return ans;
    }
}