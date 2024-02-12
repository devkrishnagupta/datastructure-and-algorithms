//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(n ^ 2)
// S.C : O(1)
class Solution{
    static long sequence(int n){
        // code here
        long mod = 1000000007;
        long ans = 0;
        long idx = 1;
        for(int i = 1; i <= n; i++){
            long curr = 1;
            for(int j = 1; j <= i; j++){
                curr *= idx++;
                curr %= mod;
            }
            ans += curr;
            ans %= mod;
        }
        
        return ans;
    }
}