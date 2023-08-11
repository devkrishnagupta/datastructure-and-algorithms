//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends

// User function Template for Java


//Approach-1 (Memorization)
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java
class Solution {
    public long count(int coins[], int N, int sum) {
        long[][] dp=new long[N+1][sum+1];
        
        for(int i=N;i>=0;i--)
        {
            for(int j=sum;j>=0;j--)
            {
                if(i==N) dp[i][j]=0;
                else if(j==sum) dp[i][j]=1;
                else
                {
                    if(j+coins[i]>sum)
                    {
                        dp[i][j]=(i+1<=N)?dp[i+1][j]:0;
                    }
                    else
                    {
                        dp[i][j]=(i+1<=N?dp[i+1][j]:0) + (dp[i][j+coins[i]]);
                    }
                }
            }
        }
        
            return dp[0][0];
    }
}

//Approach-2 (Tabulation)
class Solution {
    public long count(int coins[], int N, int sum) {
        long[][] dp=new long[N+1][sum+1];
        
        for(int i=N;i>=0;i--)
        {
            for(int j=sum;j>=0;j--)
            {
                if(i==N) dp[i][j]=0;
                else if(j==sum) dp[i][j]=1;
                else
                {
                    if(j+coins[i]>sum)
                    {
                        dp[i][j]=(i+1<=N)?dp[i+1][j]:0;
                    }
                    else
                    {
                        dp[i][j]=(i+1<=N?dp[i+1][j]:0) + (dp[i][j+coins[i]]);
                    }
                }
            }
        }
        
            return dp[0][0];
    }
}