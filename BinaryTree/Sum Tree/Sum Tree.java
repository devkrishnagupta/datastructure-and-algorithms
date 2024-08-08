// Approach-1
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {
    
    boolean isSumTree(Node root) {
        // Your code here
        boolean[] ans = new boolean[] { true };
        solve(root, ans);
        return ans[0];
    }
    
    int solve(Node root, boolean[] ans){
        
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return root.data;
        }
        
        int leftSum = solve(root.left, ans);
        int rightSum = solve(root.right, ans);
        
        if(root.data != (leftSum + rightSum)){
            ans[0] = false;
        }
        
        return root.data + leftSum + rightSum;
    }
}