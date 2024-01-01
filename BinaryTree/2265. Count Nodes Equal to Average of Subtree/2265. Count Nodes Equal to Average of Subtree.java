/**
 * Definition for a binary tree node.
 * **/
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


//Approach-1 (Brute Force)
//T.C : O(n^2) For every root, you visit it's subtree to find average
//S.C : O(1) (excluding recursion stack space)
public class Solution {
    private int result;
    
    private int sum(TreeNode root, int[] count) {
        if (root == null) {
            return 0;
        }
        
        count[0]++;
        
        int leftSum = sum(root.left, count);
        int rightSum = sum(root.right, count);
        
        return leftSum + rightSum + root.val;
    }
    
    private void solve(TreeNode root) {
        if (root == null) {
            return;
        }
        
        int[] count = {0};
        int totalSum = sum(root, count);
        
        if (totalSum / count[0] == root.val) {
            result++;
        }
        
        solve(root.left);
        solve(root.right);
    }
    
    public int averageOfSubtree(TreeNode root) {
        result = 0;
        
        solve(root);
        
        return result;
    }
}

//Approach-2 (Doing postorder traversal)
//T.C : O(n)
//S.C : O(1) (excluding recursion stack space)
  class Solution {
    int ans;
    public int averageOfSubtree(TreeNode root) {
        ans=0;
        solve(root);
        return ans;
    }
    
    public Pair<Integer, Integer> solve(TreeNode root){
        if(root==null)
            return new Pair<Integer, Integer>(0, 0);
        Pair<Integer, Integer> left = solve(root.left);
        Pair<Integer, Integer> right = solve(root.right);
        int totalSum = left.getKey() +  right.getKey() + root.val;
        int totalCount = left.getValue() + right.getValue() + 1;
        int avg = totalSum/totalCount;
        if(avg == root.val)
            ans++;
        return new Pair<Integer, Integer>(totalSum, totalCount);
    }
    
}