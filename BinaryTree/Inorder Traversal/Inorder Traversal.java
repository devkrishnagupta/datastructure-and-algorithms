// Approach-1
// T.C : O(n)
// S.C : O(Height of the Tree)
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    
    void inorder(Node root, ArrayList<Integer> ans){
        if(root == null)return;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}