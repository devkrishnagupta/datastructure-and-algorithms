//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int a[] = new int[n];
                    int b[] = new int[m];
                    for(int i = 0;i<n;i++)
                        a[i] = sc.nextInt();
                    for(int i = 0;i<m;i++)
                        b[i] = sc.nextInt();    
                    Solution ob = new Solution();
                    System.out.println(ob.maxDotProduct(n, m, a, b));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

// Approach-1 (Recursion)
// T.C : O(n * m * n)
// S.C : O(n * m * n) + O(max(n, m))
class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
		// Your code goes here
		int memo[][][] = new int[n+1][m+1][n+1];
		for(int [][] x : memo){
		    for(int [] y:x)
		    Arrays.fill(y, Integer.MIN_VALUE);
		}
		return fun(0,0,n-m, A, B, memo);
		
	} 
	int fun(int i, int j, int cntZero, int A[], int B[], int memo[][][]){
	    if(i>= A.length)
	    return 0;
	    
	    if(memo[i][j][cntZero]!=Integer.MIN_VALUE) return memo[i][j][cntZero];
	    
	    int ans = Integer.MIN_VALUE;
	    //2 calls
	    //1st call - taking 0 from B
	    if(cntZero>0)
	    ans = Math.max(ans, A[i]*0 + fun(i+1, j, cntZero-1, A, B, memo));
	    
	    //2nd call - taking the ele from B
	    if(j<B.length)
	   ans = Math.max(ans,  A[i]*B[j] + fun(i+1, j+1, cntZero, A, B, memo));
	   
	    memo[i][j][cntZero] = ans;
	    return ans;
	}
}

// Approach-2 (Memorization)
// T.C : O(n * m)
// S.C : O(n * m)
class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
		// Your code goes here
		int memo[][][] = new int[n+1][m+1][n+1];
		for(int [][] x : memo){
		    for(int [] y:x)
		    Arrays.fill(y, Integer.MIN_VALUE);
		}
		return fun(0,0,n-m, A, B, memo);
		
	} 
	int fun(int i, int j, int cntZero, int A[], int B[], int memo[][][]){
	    if(i>= A.length)
	    return 0;
	    
	    if(memo[i][j][cntZero]!=Integer.MIN_VALUE) return memo[i][j][cntZero];
	    
	    int ans = Integer.MIN_VALUE;
	    //2 calls
	    //1st call - taking 0 from B
	    if(cntZero>0)
	    ans = Math.max(ans, A[i]*0 + fun(i+1, j, cntZero-1, A, B, memo));
	    
	    //2nd call - taking the ele from B
	    if(j<B.length)
	   ans = Math.max(ans,  A[i]*B[j] + fun(i+1, j+1, cntZero, A, B, memo));
	   
	    memo[i][j][cntZero] = ans;
	    return ans;
	}
}

// Approach-3 (Tabularization)
// T.C : O(n * m)
// S.C : o(n * m)
class Solution {
    public int maxDotProduct(int n, int m, int[] A, int[] B) {
        
        int[][] dp = new int[m + 1][n + 1];
     //B
        for (int i = 1; i <= m; i++) {
            //A 
            for (int j = i; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + (A[j - 1] * B[i - 1]), dp[i][j-1]);
            }
        }
       
        return dp[m][n];
    }
}
