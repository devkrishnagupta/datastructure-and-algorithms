// Approach-1
// T.C : O(n * w)
// S.C : O(n * w)
class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n = wt.length;
        int[][] dp = new int[n][W + 1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return solve(n, W, wt, val, 0, dp);
    }
    
    static int solve(int n, int w, int[] wt, int[] val, int idx, int[][] dp){
        if(n == idx) return 0;
        if(dp[idx][w] != -1) return dp[idx][w];
        
        int nonPick = solve(n, w, wt, val, idx + 1, dp);
        int pick = 0;
        if(w >= wt[idx]){
            pick = val[idx] + solve(n, w - wt[idx], wt, val, idx + 1, dp);
        }
        
        return dp[idx][w] = Math.max(nonPick, pick);
    }
}