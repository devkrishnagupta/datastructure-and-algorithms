// Approach-1 Brute Force (Recursion)
// T.C : O(n ^ n)
// S.C : O(n)
class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int n = mat.length;
        int ans = 0;
        for(int j = 0; j < n; j++){
            ans = Math.max(ans, solve(mat, 0, j, n));
        }
        return ans;
    }
    
    public int solve(int[][] mat, int i, int j, int n){
        if(i == n - 1){
            return mat[i][j];
        } 
        
        int maxWeight = 0;
        for(int col = 0; col < n; col++){
            if(col != j){
                maxWeight = Math.max(maxWeight, solve(mat, i + 1, col, n));
            }
        }
        
        return mat[i][j] + maxWeight;
    }
}

// Approach-2 (DP)
// T.C : O(n * n * n)
// S.C : O(n * n)
class Solution1 {
    int[][] dp;
    public int zigzagSequence(int[][] mat) {
        // code here
        int n = mat.length;
        int ans = 0;
        dp = new int[n][n];
        for(int j = 0; j < n; j++){
            ans = Math.max(ans, solve(mat, 0, j, n));
        }
        return ans;
    }
    
    public int solve(int[][] mat, int i, int j, int n){
        if(i == n - 1){
            return mat[i][j];
        }
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        int maxNext = 0;
        for(int col = 0; col < n; col++){
            if(col != j){
                maxNext = Math.max(maxNext, solve(mat, i + 1, col, n));
            }
        }
        
        dp[i][j] = mat[i][j] + maxNext;
        
        return dp[i][j];
    }
}

// Approach-3 (Bottom up)
// T.C : O(n * n * n)
// S.C : O(n * n)
class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int n = mat.length;
        int[][] dp = new int[n][n];
        
        // First row
        for(int col = 0; col < n; col++){
            dp[n-1][col] = mat[n-1][col];
        }
        
        // Fill remaining rows
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j < n; j++){
                int maxNext = 0;
                for(int col = 0; col < n; col++){
                    if(col != j){
                        maxNext = Math.max(maxNext, dp[i + 1][col]);
                    }
                }
                dp[i][j] = mat[i][j] + maxNext;
            }
        }
        
        // Answer = maximum value in last row
        int ans = 0;
        for(int col = 0; col < n; col++){
            ans = Math.max(ans, dp[0][col]);
        }
        return ans;
    }
}