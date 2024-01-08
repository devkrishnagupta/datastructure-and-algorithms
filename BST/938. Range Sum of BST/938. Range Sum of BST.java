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
    int result;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        inorder(root, low, high);
        return result;
    }
    public void inorder(TreeNode root, int low, int high){
        if(root!=null && root.val >= low)
            inorder(root.left, low, high);
        if(root!=null && root.val>= low && root.val<=high)
            result+=root.val;
        if(root!=null && root.val <= high)
            inorder(root.right, low, high);
    }
}