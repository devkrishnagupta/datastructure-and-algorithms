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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        int ans = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(i == 0)
                    ans = curr.val;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        
        return ans;
    }
}

// Approach-2 (DFS) (To Ensure the left most node at maximum depth, DFS is in specific order
// means spcific order, left follow by right subtree at each level, and left most node assigned first
// & right most subtree are not greater, so the value of the right node not assigned at all)
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {
    
    int ans = 0;
    int maxDepth = -1;
    
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    
    public void dfs(TreeNode root, int depth){
        if(root == null)
            return;
        
        if(depth > maxDepth){
            maxDepth = depth;
            ans = root.val;
        }
        
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}