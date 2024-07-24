// Approach-1
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Utility function to check if the tree is a BST within given min and max constraints
    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
    }
}

// Approach-2 (As Inorder Gives the sorted result for BST)
// T.C : O(n)
// S.C : O(Height of the tree) + O(n)   ~   O(n)
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        List<Integer> ans = new ArrayList<>();
        
        inorder(root, ans);
        
        for(int i = 0; i < ans.size() - 1; i++){
            if(ans.get(i) >= ans.get(i + 1))
                return false;
        }
        
        return true;
    }

    // Utility function to check if the tree is a BST within given min and max constraints
    void inorder(Node root, List<Integer> ans) {
        if(root == null)
            return;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}