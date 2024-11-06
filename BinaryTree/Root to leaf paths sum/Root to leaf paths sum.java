// Approach-1 (DFS)
// T.C : O(n)
// S.C : O(Height of the Tree)
class Solution {
    public static int treePathsSum(Node root) {
        // add code here.
        return solve(root, 0);
    }
    public static int solve(Node root, int sum){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 10 * sum + root.data;
        
        int left = root.left != null ? solve(root.left, 10 * sum + root.data) : 0;
        int right = root.right != null ? solve(root.right, 10 * sum + root.data) : 0;
        
        return left + right;
    }
}