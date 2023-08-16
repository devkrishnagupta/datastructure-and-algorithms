//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.findCatalan(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




//Approach-1 (using recusrion)
class Solution {
    public static int mod=1000000007;
    public static int findCatalan(int n) {
        // code here
        int count = solve(0, 0, n);
        return count%mod;
    }
    
    public static int solve(int open, int close, int n){
        if(open==n && close==n){
            return 1;
        }
        int o=0;
        int c=0;
        if(open<n){
            o=solve(open+1, close, n);
        }
        if(open>close){
            c=solve(open, close+1, n);
        }
        return o+c;
    }
}

//Approach-2 (USING DP)
//Using balenced parenthesis
class Solution {
    public static int mod=1000000007;
    public static int[][] memo;
    public static int findCatalan(int n) {
        // code here
        memo=new int[n+1][n+1];
        for(int[] arr: memo)
            Arrays.fill(arr, -1);
        int count = solve(0, 0, n);
        return count%mod;
    }
    
    public static int solve(int open, int close, int n){
        if(open==n && close==n){
            return 1;
        }
        if(memo[open][close]!=-1){
            return memo[open][close];
        }
        int openCount=0;
        int closeCount=0;
        if(open<n){
            openCount=solve(open+1, close, n);
        }
        if(open>close){
            closeCount=solve(open, close+1, n);
        }
        return memo[open][close]=(openCount+closeCount)%mod;
    }
}
        



//Using Pattern ==> C(3) =  C(2)*C(0) + C(1)*C(1) + C(0)*C(2);//
class Solution {
    public static int mod=1000000007;
    public static int[] memo;
    public static int findCatalan(int n) {
        // code here
        memo=new int[n+1];
        Arrays.fill(memo, -1);
        int count=solve(n);
        return count%mod;
    }
    
    public static int solve(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        if(n==2)return 2;
        if(memo[n]!=-1)return memo[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum = (sum + ((solve(i)%mod)*(solve(n-1-i)%mod))%mod)%mod;
        }
        return memo[n]=sum%mod;
    }
}
        
//Using Pattern ==> C(3) =  C(2)*C(0) + C(1)*C(1) + C(0)*C(2);//
class Solution {
   static int m = 1000000007;
    public static int findCatalan(int n) {
        long dp[] = new long[n+1];
        dp[0]=1; dp[1]=1;
        for(int i =2; i<=n ; i++)
        {
            for(int j=0; j<i; j++)
            dp[i] = (dp[i]+ (dp[j]*dp[i-j-1])%m)%m;
        }
        return (int)dp[n];
    }
}
  
        
