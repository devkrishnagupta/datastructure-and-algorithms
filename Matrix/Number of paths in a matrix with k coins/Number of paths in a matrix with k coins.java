//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Approach-1 (Recursion)
// T.C : O(2 ^ n)
// S.C : O(Stack Size)
class Solution {
    int n, k;
    
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        this.n = n;
        this.k = k;
        return solve(arr, 0, 0, 0);
    }
    
    long solve(int[][] arr, int i, int j, int sum){
        if(i >= n || j >= n){
            return 0;
        }
        
        if(i == n - 1 && j == n - 1){
            sum += arr[i][j];
            return sum == k ? 1 : 0;
        }
        
        return solve(arr, i + 1, j, sum + arr[i][j]) + solve(arr, i, j + 1, sum + arr[i][j]);
    }
}

// Approach-2 (Recursion + Memorization)
// T.C : O(n * n * k)
// S.C : O(n * n * k)
class Solution {
    int n, k;
    long[][][] t;
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        this.n = n;
        this.k = k;
        t = new long[n][n][k + 1];
        for(long[][] arr1: t){
            for(long[] arr2: arr1){
                Arrays.fill(arr2, -1);
            }
        }
        
        return solve(arr, 0, 0, 0);
    }
    
    long solve(int[][] arr, int i, int j, int sum){
        if(i >= n || j >= n || sum > k){
            return 0;
        }
        
        if(t[i][j][sum] != -1){
            return t[i][j][sum];
        }
        
        if(i == n - 1 && j == n - 1){
            sum += arr[i][j];
            return sum == k ? 1 : 0;
        }
        
        return t[i][j][sum] = solve(arr, i + 1, j, sum + arr[i][j]) + solve(arr, i, j + 1, sum + arr[i][j]);
    }
}

// Approach-2 (Bottom up)
// T.C :
// S.C :
