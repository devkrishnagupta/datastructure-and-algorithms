// Approach-1
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        return solve(root, 0, target);
    }
    
    boolean solve(Node root, int sum, int target){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            sum += root.data;
            return sum == target;
        }
        
        return solve(root.left, sum + root.data, target) || solve(root.right, sum + root.data, target);
    }
}