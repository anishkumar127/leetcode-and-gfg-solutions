/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */

var minDiffInBST = function(root) {
    
    let min = Number.MAX_VALUE;
    let prev = null;
    inOrder(root);
    
    function inOrder(root){
    if(root===null) return ;
    
    inOrder(root.left);
    
    if(prev!==null){
        min = Math.min(min,root.val-prev);
    }
    
    prev = root.val;
    
    inOrder(root.right);
   }
    
    return min;
};

