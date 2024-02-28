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

 // Approach-1 (Used a global to store the answer)
 // T.C : O(n)
 // S.C : O(Height of Tree)
class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        
        solve(root);
        return ans;
    }
    
    public int solve(TreeNode root){
        if(root == null) return 0;
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        
        ans = Math.max(ans, left + right);
        
        return 1 + Math.max(left, right);
    }
}

 // Approach-2 (Used array to store the as in Java array is call by reference)
 // T.C : O(n)
 // S.C : O(Height of Tree)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int[] result = { Integer.MIN_VALUE };
        diameter(root, result);

        return result[0];
    }

    private int diameter(TreeNode root, int[] result) {
        if (root == null)
            return 0;

        int left = diameter(root.left, result);
        int right = diameter(root.right, result);

        result[0] = Math.max(result[0], left + right);

        return Math.max(left, right) + 1;
    }
}