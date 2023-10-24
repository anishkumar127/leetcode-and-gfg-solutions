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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) return new LinkedList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {
            int n = que.size();
            int max = Integer.MIN_VALUE;
            while (n-- > 0) {
                TreeNode node = que.poll();
                max = Math.max(max, node.val);
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
