// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution
{
    int ans;
    int absolute_diff(Node root)
    {
        //Your code here
        ans = Integer.MAX_VALUE;
        List<Integer> al = new ArrayList<>();
        inorder(root, al);
        int n = al.size();
        for(int i = 1; i < n; i++){
            ans = Math.min(ans, al.get(i) - al.get(i - 1));
        }
        return ans;
    }
    
    void inorder(Node root, List<Integer> al){
        if(root == null){
            return;
        }
        
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
}

// Approach-2
// T.C : O(n)
// S.C : o(Height of Tree)
class Solution
{
    int ans;
    int prev;
    int absolute_diff(Node root)
    {
        //Your code here
        ans = Integer.MAX_VALUE;
        prev = Integer.MAX_VALUE;
        inorder(root);
        return ans;
    }
    
    void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        
        if(prev != Integer.MAX_VALUE){
            ans = Math.min(ans, root.data - prev);
        }
        prev = root.data;
        
        inorder(root.right);
    }
}


////////////////////////
/// Use inorder traversal because a BST's inorder traversal gives values in sorted order. Therefore, the minimum absolute difference can only occur between adjacent values in inorder traversal.
class Solution {
    int prev = -1;
    int ans = Integer.MAX_VALUE;
    public int absDiff(Node root) {
        // code here
        inorder(root);
        return ans;
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);

        if(prev != -1){
            ans = Math.min(ans, root.data - prev);
        }
        prev = root.data;

        inorder(root.right);
    }
}