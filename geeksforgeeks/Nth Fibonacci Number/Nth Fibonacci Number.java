//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Approach-1 (using rescusrion)
//Time => 2^n
//Space => n
class Solution {
    static int[] memo;
    static int mod=1000000007;
    static int nthFibonacci(int n){
        // code here
        memo=new int[n+1];
        Arrays.fill(memo, -1);
        return solve(n);
    }
    
    static int solve(int n){
        if(n==0 || n==1)return n;
        if(memo[n]!=-1)return memo[n];
        int a=solve(n-1)%mod;
        int b=solve(n-2)%mod;
        return memo[n]=(a+b)%mod;
    }
}

//Approach-2 (using dp)
//Time => n
//Space => n
class Solution {
    static int mod=1000000007;
    static int nthFibonacci(int n){
        // code here
        return solve(n);
    }
    
    static int solve(int n){
        if(n==0 || n==1)return n;
        int a=solve(n-1)%mod;
        int b=solve(n-2)%mod;
        return (a+b)%mod;
    }
}

//Approach-3 (Swapping 3-variables)
//Time => n
//Space => 1
class Solution {
    static int mod=1000000007;
    static int nthFibonacci(int n){
        // code here
        if(n==0 || n==1)return n;
        int a=0,b=1,ans=0;
        for(int i=2;i<=n;i++){
            ans=a+b;
            ans%=mod;
            a=b;
            b=ans;
        }
        return ans;
    }
}

//Approach-4 (Using array)
//Time => n
//Space => n
class Solution {
    static int mod=1000000007;
    static int nthFibonacci(int n){
        // code here
        int[] fib=new int[n+1];
        fib[0]=0;fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=(fib[i-1]+fib[i-2])%mod;
        }
        return fib[n];
    }
}

//Approach-5 (Using matrix exponential)
class Solution {
    int m = 1000000007;
    public int countStrings(long N) {
        // Code here
        return (int)fib(N+2);
    }
    long fib(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
         if (n == 0)
            return 0;
        power(F, n-1);
      
        return F[0][0];
    }
    
     void multiply(long F[][], long M[][])
    {
        long x = ( (F[0][0]%m *M[0][0]%m)%m + (F[0][1]%m * M[1][0]%m)%m )%m;
        long y = ( (F[0][0]%m *M[0][1]%m)%m + (F[0][1]%m * M[1][1]%m)%m )%m;
        long z = ( (F[1][0]%m *M[0][0]%m)%m + (F[1][1]%m * M[1][0]%m)%m )%m;
        long w = ( (F[1][0]%m *M[0][1]%m)%m + (F[1][1]%m * M[1][1]%m)%m )%m;
         
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    
    void power(long F[][], long n)
    {
    if( n == 0 || n == 1)
      return;
    long M[][] = new long[][]{{1,1},{1,0}};
      
    power(F, n/2);
    multiply(F, F);
      
    if (n%2 != 0)
       multiply(F, M);
    }
      
}