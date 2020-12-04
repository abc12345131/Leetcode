class Solution {
    private int depth(TreeNode root) {
        int left = root.left == null ? 0 : depth(root.left);
        int right = root.right == null ? 0 : depth(root.right);
        return 1 + Math.max(left, right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root);
    }
}