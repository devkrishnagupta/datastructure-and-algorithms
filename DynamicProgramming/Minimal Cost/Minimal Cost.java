// Approach-1 (DP)
// T.C : O()
// S.C : O()
class Solution {
    int help(int i,int k,int arr[],int dp[]){
        if(i==arr.length-1)return 0;
        if(dp[i]!=-1)return dp[i];
        int ans = Integer.MAX_VALUE;
        for(int j=i+1;j<=i+k && j<arr.length;j++){
            int cost = Math.abs(arr[i]-arr[j])+help(j,k,arr,dp);
            ans=Math.min(ans,cost);
        }
        return dp[i] = ans;
    }
    public int minimizeCost(int k, int arr[]) {
        // code here
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        return help(0,k,arr,dp);
    }
}

// Approach-1 (Bottom UP)
// T.C : O()
// S.C : O()
class Solution {
    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;  // Cost to reach the first index is 0
        
        for (int i = 0; i < n; i++) {
            for (int jump = 1; jump <= k; jump++) {
                if (i + jump < n) {
                    dp[i + jump] = Math.min(dp[i + jump], dp[i] + Math.abs(arr[i] - arr[i + jump]));
                }
            }
        }
        
        return dp[n - 1];
    }
}