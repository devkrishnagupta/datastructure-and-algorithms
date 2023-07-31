//Approach-1 (Before Memorization)
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        return solve(s1, s2, 0, 0);
    }
    
    public int solve(String s1, String s2, int i, int j){
        if(s1.length()==i && s2.length()==j) return 0;
        if(s1.length()==i) return s2.charAt(j) + solve(s1, s2, i, j+1);
        if(s2.length()==j) return s1.charAt(i) + solve(s1, s2, i+1, j);
        if(s1.charAt(i)==s2.charAt(j)) return solve(s1, s2, i+1, j+1);
        int delete_s1_i = s1.charAt(i) + solve(s1, s2, i+1, j);
        int delete_s2_j = s2.charAt(j) + solve(s1, s2, i, j+1);
        return Math.min(delete_s1_i, delete_s2_j);
    }
}

//Approach-1 (After Memorization)
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] x: dp)
             Arrays.fill(x, -1);   
        return solve(s1, s2, 0, 0, dp);
    }
    
    public int solve(String s1, String s2, int i, int j, int[][] dp){
        if(s1.length()==i && s2.length()==j) return 0;
        if(s1.length()==i) return s2.charAt(j) + solve(s1, s2, i, j+1, dp);
        if(s2.length()==j) return s1.charAt(i) + solve(s1, s2, i+1, j, dp);
        if(s1.charAt(i)==s2.charAt(j)) return solve(s1, s2, i+1, j+1, dp);
        if(dp[i][j]!=-1)return dp[i][j];
        int delete_s1_i = s1.charAt(i) + solve(s1, s2, i+1, j, dp);
        int delete_s2_j = s2.charAt(j) + solve(s1, s2, i, j+1, dp);
        return dp[i][j]=Math.min(delete_s1_i, delete_s2_j);
    }
}

//Approach-2
//Find Longest common subsequence and find their ASCII sum of LCS and subtract twoice of it from sum of characters from both strings.