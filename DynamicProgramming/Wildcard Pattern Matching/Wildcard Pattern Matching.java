// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int help(String pattern,String str,int i,int j,int dp[][]){
        if(i==pattern.length() && j==str.length())return 1;
        if(i==pattern.length())return 0;
        if(j==str.length() && pattern.charAt(i)=='*')return help(pattern,str,i+1,j,dp);
        if(j==str.length())return 0;
        if(pattern.charAt(i)!='?' && pattern.charAt(i)!='*' && pattern.charAt(i)!=str.charAt(j))return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int a=0,b=0,c=0;
        if(pattern.charAt(i)=='*'){
            a=help(pattern,str,i,j+1,dp);
            b=help(pattern,str,i+1,j,dp);
        }
        c=help(pattern,str,i+1,j+1,dp);
        return dp[i][j] = a|b|c;
    }
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int dp[][] = new int[pattern.length()][str.length()];
        for(int temp[]:dp)Arrays.fill(temp,-1);
        return help(pattern,str,0,0,dp);
    }
}