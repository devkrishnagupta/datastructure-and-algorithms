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

// Approach-1 (DFS)
// T.C : O(n)
// S.C : O(Height of the Tree)
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    
    private int sumNumbers(TreeNode root, int sum) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return sum * 10 + root.val;

        int leftSum = sumNumbers(root.left, sum * 10 + root.val);
        int rightSum = sumNumbers(root.right, sum * 10 + root.val);

        return leftSum + rightSum;
    }
}