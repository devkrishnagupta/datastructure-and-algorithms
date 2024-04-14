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
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root, false);
    }
    
    public int solve(TreeNode root, boolean isLeft){
        if(root == null) return 0;
        
        if(root.left == null && root.right == null){
            return isLeft ? root.val : 0;
        }
        
        return solve(root.left, true) + solve(root.right, false);
    }
}

// Approach-2 (BFS)
// T.C : O(n)
// S.C : O(Width of the Tree)
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                TreeNode left = curr.left;
                TreeNode right = curr.right;
                
                if(left != null){
                    q.add(left);
                    if(left.left == null && left.right == null){
                        ans += left.val;
                    }
                }
                
                if(right != null){
                    q.add(right);
                }
            }
        }
        
        return ans;
    }
}