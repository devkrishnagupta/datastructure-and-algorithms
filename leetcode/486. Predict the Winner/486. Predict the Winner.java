// Approach 1
class Solution {
    int [][] dp;
    public boolean PredictTheWinner(int[] nums) {
        dp=new int[21][21];
        for(int[] x: dp)
            Arrays.fill(x, -1);
        int totalScore = Arrays.stream(nums).sum();
        int n=nums.length;
        int player_1=solve(0, n-1, nums);
        int player_2=totalScore-player_1;
        return player_1>=player_2;
    }
    public int solve(int i, int j, int[] nums){
        if(i>j)
            return 0;
        if(i==j)
            return nums[i];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int take_i=nums[i]+Math.min(solve(i+2, j, nums), solve(i+1, j-1, nums));
        int take_j=nums[j]+Math.min(solve(i+1, j-1, nums), solve(i, j-2, nums));
        return dp[i][j]=Math.max(take_i, take_j);
    }
}

// Approach 2
class Solution {
    int [][] dp;
    public boolean PredictTheWinner(int[] nums) {
        dp=new int[21][21];
        for(int[] x: dp)
            Arrays.fill(x, -1);
        return solve(0, nums.length-1, nums)>=0;
    }
    public int solve(int i, int j, int[] nums){
        if(i>j)
            return 0;
        if(i==j)
            return nums[i];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int take_i=nums[i] - solve(i+1, j, nums);
        int take_j=nums[j] - solve(i, j-1, nums);
        return dp[i][j]=Math.max(take_i, take_j);
    }
}