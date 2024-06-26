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
// S.C : O(Height of tree)
 class Solution {
    String result = "";

    void solve(TreeNode root, String curr) {
        if (root == null) {
            return;
        }

        curr = (char) (root.val + 'a') + curr; // This will take O(length of curr) but I have ignored this. You can consider this as well in calculating T.C

        if (root.left == null && root.right == null) {
            if (result.equals("") || result.compareTo(curr) > 0) {
                result = curr;
            }
            return;
        }

        solve(root.left, curr);
        solve(root.right, curr);
    }

    public String smallestFromLeaf(TreeNode root) {
        solve(root, "");
        return result;
    }
}

// Approach-2 (BFS)
// T.C : O(n)
// S.C : O(Width of tree)
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        Queue<Pair<TreeNode, String>> queue = new LinkedList<>();
        
        String result = "";
        queue.add(new Pair<>(root, String.valueOf((char)(root.val + 'a'))));
        
        while (!queue.isEmpty()) {
            Pair<TreeNode, String> pair = queue.poll();
            TreeNode node = pair.getKey();
            String curr = pair.getValue();
            
            if (node.left == null && node.right == null) {
                if (result.equals("") || result.compareTo(curr) > 0) {
                    result = curr;
                }
            }
            
            if (node.left != null) {
                queue.add(new Pair<>(node.left, (char)(node.left.val + 'a') + curr));
            }
            
            if (node.right != null) {
                queue.add(new Pair<>(node.right, (char)(node.right.val + 'a') + curr));
            }
        }
        
        return result;
    }
}