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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            long ans = ob.min_operations(nums);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(n * n)
// S.C : o(n)
class Solution
{
    public int min_operations(int []a)
    {
        int n = a.length;
        int lis[] =new int[n];  lis[0]=1;
        int res=lis[0];
        for(int i=1; i<n ;i++)
        {
            lis[i]=1;
            for(int j=0; j<i; j++)
            {
                if(a[j]<a[i]&&  a[i] - a[j] > i - j - 1 )
                lis[i] = Math.max(lis[i], lis[j]+1);
            }
             res= Math.max(res, lis[i]);
        }
        // for(int x : lis){
        //     System.out.print(x+ " "); 
        // }
        return n - res;
    }
}