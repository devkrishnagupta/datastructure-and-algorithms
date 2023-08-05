//Approach-1 (Using Recursion)
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
class Solution {
    
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);
    }
    
    public List<TreeNode> solve(int start, int end){
        List<TreeNode> ans=new ArrayList<>();
        if(start>end){
            ans.add(null);
            return ans;
        }
        if(start==end){
            ans.add(new TreeNode(start));
            return ans;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> left_bsts = solve(start, i-1);
            List<TreeNode> right_bsts = solve(i+1, end);
            for(TreeNode leftRoot: left_bsts){
                for(TreeNode rightRoot: right_bsts){
                    TreeNode root=new TreeNode(i);
                    root.left=leftRoot;
                    root.right=rightRoot;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}

//Approach-2 (Using Recursion+Memorization)
class Solution {
    Map<Pair<Integer, Integer>, List<TreeNode>> memo; 
    public List<TreeNode> generateTrees(int n) {
        memo=new HashMap<>();
        return solve(1, n);
    }
    
    public List<TreeNode> solve(int start, int end){
        List<TreeNode> ans=new ArrayList<>();
        if(start>end){
            ans.add(null);
            return ans;
        }
        if(start==end){
            ans.add(new TreeNode(start));
            return ans;
        }
        if(memo.containsKey(new Pair(start, end))){
            return memo.get(new Pair(start, end));
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> left_bsts = solve(start, i-1);
            List<TreeNode> right_bsts = solve(i+1, end);
            for(TreeNode leftRoot: left_bsts){
                for(TreeNode rightRoot: right_bsts){
                    TreeNode root=new TreeNode(i);
                    root.left=leftRoot;
                    root.right=rightRoot;
                    ans.add(root);
                }
            }
        }
        memo.put(new Pair(start, end), ans);
        return ans;
    }
}

//Approach-3 (Bottom up)