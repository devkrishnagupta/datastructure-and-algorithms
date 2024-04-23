//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    static int firstElement(int n) {
        // code here
        if(n==1 || n==2)return 1;
        int a=1,b=1,ans=0,mod=1000000007;
        for(int i=3;i<=n;i++){
            ans=(a+b)%mod;
            a=b;
            b=ans;
        }
        return ans;
    }
}