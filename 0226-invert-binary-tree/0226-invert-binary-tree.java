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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode treeNode = stack.pop();
            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
            if (treeNode.right != null) stack.push(treeNode.right);
            if (treeNode.left != null) stack.push(treeNode.left);
        }

    return root;
    }
}