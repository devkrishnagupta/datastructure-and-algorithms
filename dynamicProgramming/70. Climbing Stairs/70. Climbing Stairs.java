//Approach-1 (Recursion + Dynamic Programming)
//T.C : O(n)
//S.C : O(n)
class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
    
    public int solve(int rem){
        if(rem < 0) return 0;
        if(rem == 0) return 1;
        
        if(dp[rem] != -1) return dp[rem];
        
        int usingOne = solve(rem - 1);
        int usingTwo = solve(rem - 2);
        
        return dp[rem] = usingOne + usingTwo;
    }
}

//Approach-2 (Bottom-up + Dynamic Programming)
//T.C : O(n)
//S.C : O(n)
class Solution {
    public int climbStairs(int n) {
        
        if(n <= 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}