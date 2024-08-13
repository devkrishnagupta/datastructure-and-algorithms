// Approach-1
// T.C : O(2 ^ n)
// S.C : O(n)
class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        solve(candidates, target, temp, 0, n);
        
        return ans;
    }
    
    public void solve(int[] candidates, int target, List<Integer> temp, int start, int n){
        if(target < 0){
            return;
        }
        
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int idx = start; idx < n; idx++){
            if(idx > start && candidates[idx] == candidates[idx - 1]){
                continue;
            }
            
            temp.add(candidates[idx]); //  DO // Explore
            solve(candidates, target - candidates[idx], temp, idx + 1, n);
            temp.remove(temp.size() - 1); // UNDO
        }
    }
}