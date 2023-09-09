//Approach-1 (Without DP => which can't be memorized or tabularization)
class Solution {
    int ans;
    int[] memo;
    public int combinationSum4(int[] nums, int target) {
        ans=0;
        int n=nums.length;
        memo=new int[n+1];
        solve(nums, 0, target, nums.length);
        return ans;
    }
    public void solve(int[] nums, int sum, int target, int n){
        if(sum==target){
            ans++;
        }
        if(sum<target){
            for(int i=0;i<n;i++){
                solve(nums, sum+nums[i], target, n);
            }
        }
    }
}

//Approach-2 (Correct Solution using Backtracking)
class Solution {
    int n;
    int[][] memo;
    public int combinationSum4(int[] nums, int target) {
        n=nums.length;
        memo=new int[n+1][target+1];//[201][1000]
        for(int[] arr: memo)
            Arrays.fill(arr, -1);
        return solve(nums, 0, target);
    }
    public int solve(int[] nums, int idx, int target){
        if(target==0)
            return 1;
        if(idx>=n || target<0)
            return 0;
        if(memo[idx][target]!=-1)return memo[idx][target];
        int take_idx = solve(nums, 0, target-nums[idx]);
        int reject_idx = solve(nums, idx+1, target);
        return memo[idx][target]=take_idx+reject_idx;
    }
}

//Approach-2 (Using for loop)
class Solution {
    int n;
    int[][] memo;
    public int combinationSum4(int[] nums, int target) {
        n=nums.length;
        memo=new int[n+1][target+1];//[201][1000]
        for(int[] arr: memo)
            Arrays.fill(arr, -1);
        return solve(nums, 0, target);
    }
    public int solve(int[] nums, int idx, int target){
        if(target==0)
            return 1;
        if(idx>=n || target<0)
            return 0;
        if(memo[idx][target]!=-1)return memo[idx][target];
        int result=0;
        for(int i=idx;i<n;i++){
            result+=solve(nums, 0, target-nums[i]);
        }
        return memo[idx][target]=result;
    }
}