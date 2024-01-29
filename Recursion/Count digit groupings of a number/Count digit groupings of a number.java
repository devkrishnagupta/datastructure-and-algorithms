//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(N * N)
// S.C : O(N * N) ~ DP
class Solution
{
    int[][] t = new int[101][901];
    
    public int TotalCount(String str)
    {
        // Code here
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        int l = str.length();
        int ans = solve(0, 0, l, str);
        
        return ans;
    }
    
    int solve(int pos, int prevSum, int len, String str){
        
        if(pos == len){
            return 1;
        }
        
        if(t[pos][prevSum] != -1){
            return t[pos][prevSum];
        }
        
        t[pos][prevSum] = 0;
        
        int res = 0;
        int sum = 0;
        
        for(int i = pos; i < len; i++){
            sum += (str.charAt(i) - '0');
            if(sum >= prevSum){
                res += solve(i + 1, sum, len, str);
            }
        }
        
        t[pos][prevSum] = res;
        
        return res;
    }
}