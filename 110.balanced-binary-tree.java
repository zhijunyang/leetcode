
/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    static boolean a = true;

    public boolean isBalanced(TreeNode root) {
        a = true;
        f(root);
        return a;

    }

    private int f(TreeNode root) {
        if (root == null)
            return 1;
        int lh = f(root.left);
        int rh = f(root.right);
        if (Math.abs(lh - rh) >= 2) {
            a = false;
            return 0;
        }
        return 1 + Math.max(lh, rh);
    }
}
// @lc code=end
