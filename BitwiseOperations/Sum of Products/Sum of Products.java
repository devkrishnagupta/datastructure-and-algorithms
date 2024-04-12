//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            long Arr[] = new long[N];
            String[] S = read.readLine().split(" ");
            for (int i = 0; i < N; i++) Arr[i] = Long.parseLong(S[i]);
            Solution ob = new Solution();
            System.out.println(ob.pairAndSum(N, Arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)
class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
        long ans = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                ans += arr[i] & arr[j];
            }
        }
        
        return ans;
    }
}

// Approach-2 (Using Bitwise)
// T.C : O(n)
// S.C : O(1)
class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
        long ans=0;
    for(int i=0; i<32; i++){
        long k=0; //setCount
        for(int j=0; j<n; j++){
            //check ith bit set or not
        
            if ((arr[j] & (1<<i)) !=0) k++;
        }
        // weightage of ith bit * all poss pairs
        ans += (1<<i)* ((k)*(k-1))/2;
    }
    return ans;
    }
}