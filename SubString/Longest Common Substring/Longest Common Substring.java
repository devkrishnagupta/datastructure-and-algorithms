// Approach-1 (Using Constructing 2-day Matraph Traversing using graph)
// T.C : O()
// S.C : O()


// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int res=0;
        int n=str1.length(),m=str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(res<dp[i][j]) res=dp[i][j];
                }
            }
        }
        return res;
    }
}