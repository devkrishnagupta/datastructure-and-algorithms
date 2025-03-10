// Approach-1
// T.C : O(n)
// S.C : O(Height of Tree)
class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 0;
        int left = 1 + height(node.left);
        int right = 1 + height(node.right);
        return Math.max(left, right);
    }
}