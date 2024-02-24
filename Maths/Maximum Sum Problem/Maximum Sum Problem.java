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
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

// Approach-1 (Recursion)
// T.C : O(n)
// S.C : O(n)
class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n == 0) return 0;

        int half = Math.max(n / 2, maxSum(n / 2));
        int third = Math.max(n / 3, maxSum(n / 3));
        int fourth = Math.max(n / 4, maxSum(n / 4));
        
        return Math.max(n, half + third + fourth);
    } 
}

// Approach-2 (Bottom up)
// T.C : O(n)
// S.C : O(n)
class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        int[] t = new int[n + 1];
        t[0] = 0;
        
        for(int i = 1; i <= n; i++){
            t[i] = Math.max(i, t[i / 2] + t[i / 3] + t[i / 4]);
        }
        
        return t[n];
    } 
}
