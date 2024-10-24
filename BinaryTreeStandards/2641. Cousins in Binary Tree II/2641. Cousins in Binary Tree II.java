// Approach-1 (Two Pass, DFS)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null) return null;
        
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.add(root);
        List<Integer> levelSum = new ArrayList<>();
        
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
                sum += curr.val;
            }
            levelSum.add(sum);
        }
        
        dfs(root, 0, levelSum);
        
        return root;
    }
    
    public void dfs(TreeNode root, int level, List<Integer> levelSum){
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        
        int leftSum = root.left == null ? 0 : root.left.val;
        int rightSum = root.right == null ? 0 : root.right.val;
        int siblingSum = leftSum + rightSum;
        int sum = levelSum.get(level + 1) - siblingSum;
        
        if(root.left != null){
            root.left.val = sum;
            dfs(root.left, level + 1, levelSum);
        }
        
        if(root.right != null){
            root.right.val = sum;
            dfs(root.right, level + 1, levelSum);
        }
    }
}

// Approach-2 (Two Pass, BFS)
// T.C : O(n)
// S.C : O(n)

// Approach-3 (One Pass, BFS) (Optimal)
// T.C : O(n)
// S.C : O(n)