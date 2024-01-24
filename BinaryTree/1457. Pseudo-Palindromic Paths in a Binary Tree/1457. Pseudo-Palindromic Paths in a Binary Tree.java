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

// Approach-1 (Find all paths & then check the occurrence of odd numbers must be less than or equals to 1)
// T.C : 
// S.C : 
class Solution {
    
    ArrayList<ArrayList<Integer>> paths;
    
    public int pseudoPalindromicPaths (TreeNode root) {
        paths = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        dfs(root, temp);
        
        int ans=0;
        
        for(ArrayList<Integer> path: paths){
            if(isPseudoPalindromicPath(path)){
                ans++;
            }
        }
        
        return ans;
    }
    
    public boolean isPseudoPalindromicPath(ArrayList<Integer> path){
        int[] freq = new int[10];
        for(int val: path){
            freq[val]++;
        }
        int count = 0;
        for(int val: freq){
            if(val % 2 != 0){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        
        return true;
    }
    
    public void dfs(TreeNode root, ArrayList<Integer> temp){
        
        if(root == null){
            return;
        }
        
        temp.add(root.val);
        
        if(root.left == null && root.right == null){
            paths.add(new ArrayList<>(temp));
        }
        
        
        
        dfs(root.left, temp);
        dfs(root.right, temp);
        
        temp.remove(temp.size()-1);
    }
}

//Approach-2 (Using approach-1 with optimized way)
// T.C : 
// S.C : 
class Solution {
    
    int result = 0;
    
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] count = new int[10];
        
        solve(root, count);
        
        return result;
    }
    
    public void solve(TreeNode root, int[] count){
        
        if(root == null){
            return;
        }
        
        count[root.val]++;
        
        if(root.left == null && root.right == null){// leaf node
            int oddFreq = 0;
            for(int i = 1; i <= 9; i++){
                if(count[i] % 2 != 0){//odd
                    oddFreq++;
                }
            }
            if(oddFreq <= 1){
                result++;
            }
        }
        
        solve(root.left, count);
        solve(root.right, count);
        
        count[root.val]--;
    }
}

//Question: Can we get rid of passing vector?
//Yes
//Approach-3 (using bit we finding the XOR and count the resultant count is Power of 2 means only one odd value)
// T.C : O(N)
// S.C : O(Height of tree) ~ Recursive call stack
class Solution {
    
    int result = 0;
    
    public int pseudoPalindromicPaths (TreeNode root) {
        
        solve(root, 0);
        
        return result;
    }
    
    public void solve(TreeNode root, int count){
        
        if(root == null){
            return;
        }
        
        count = (count ^ (1 << root.val));
        
        if(root.left == null && root.right == null){// leaf node
            if((count & (count - 1)) == 0){
                result++;
            }
        }
        
        solve(root.left, count);
        solve(root.right, count);
    }
}