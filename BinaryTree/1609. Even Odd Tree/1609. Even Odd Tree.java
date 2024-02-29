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

// Approach-1 (BFS)
// T.C : O(n)
// S.C : O(Width of the tree)
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isEven = true;

        while (!q.isEmpty()) {
            int size = q.size();
            int prev = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (isEven && (prev >= curr.val || curr.val % 2 == 0)) {
                    return false;
                } else if (!isEven && (prev <= curr.val || curr.val % 2 == 1)) {
                    return false;
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

                prev = curr.val;
            }

            isEven = !isEven;
        }

        return true;
    }
}