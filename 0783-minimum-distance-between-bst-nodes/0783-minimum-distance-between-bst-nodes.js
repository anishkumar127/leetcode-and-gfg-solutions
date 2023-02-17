const minDiffInBST = function(root) {
    const values = getAllValues(root, []);

    let min = 10000;

    for (let i = 1; i in values; i++) {
        min = Math.min(values[i] - values[i - 1], min);
    }

    return min;
}

function getAllValues(root, values) {
    if (!root) return;

    // Inorder traversal of the BST
    // keeps the values array sorted
    getAllValues(root.left, values);
    values.push(root.val);
    getAllValues(root.right, values);

    return values;
}