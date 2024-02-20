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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java
//Approach-1
class Solution
{
    long mod = 1000000007;
    public int TotalWays(int N)
    {
      long a =1;long b=1; long c =0;
      for(int i =1; i<=N; i++)
      {
          c=(a%mod+b%mod)%mod;
          a=b%mod;
          b=c%mod;
      }
      return (int)((c*c)%mod);
    }
}

//Approach-2
class Solution
{
    long mod = 1000000007;
    public int TotalWays(int N)
    {
      long fib[] = new long[N+1];
        
        //s2
        fib[0]=2; fib[1]=3;
        
        for(int i =2; i<=N-1; i++)
        {
            fib[i] = (fib[i-1]%mod + fib[i-2]%mod)%mod;
        }
        return (int) ((fib[N-1] * fib[N-1])%mod);
    }
}

//Approach-3 (Using DP + Recursion)
class Solution
{
    int mod = 1000000007;
    int building=1;
    int space=0;
    int t[][];
    public int TotalWays(int N)
    {
        // Code here
        t=new int[N + 1][2];
        for(int[] arr: t)
            Arrays.fill(arr, -1);
        int x = (solve(N - 1, building) % mod + solve(N - 1, space) % mod) % mod;
        return  (x * x) % mod;
    }
    
    public int solve(int plot, int status){
        if(plot==0){
            return 1;
        }
        
        if(t[plot][status] != -1) return t[plot][status];
        
        if(status==building){
            return t[plot][status] = solve(plot - 1, space) % mod;
        }else{
            return t[plot][status] = (solve(plot - 1, space) % mod + solve(plot - 1, building) % mod) % mod;
        }
    }
}

//Approach-4 (Using DP + Bottom up)
class Solution
{
    int mod = (int) 1e9+7;
    int building=1;
    int space=0;
    public int TotalWays(int N)
    {
        // Code here
        int[][] t = new int[N + 1][2];
        
        for(int i = 0; i < N; i++)
            Arrays.fill(t[i], -1);
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                if(i==0){
                    t[i][j] = 1;
                    continue;
                }
                if(j==building){
                    t[i][j] = t[i - 1][space] % mod;
                } else {
                    t[i][j] = (t[i - 1][space] % mod + t[i - 1][building] % mod) % mod;
                }
            }
        }
        long result = (t[N - 1][building] % mod + t[N - 1][space] % mod) % mod;
        return (int) ((result * result) % mod);
    }
}