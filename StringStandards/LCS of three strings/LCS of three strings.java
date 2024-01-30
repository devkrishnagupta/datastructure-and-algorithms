//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(n1 * n2 * n3)
// S.C : O(n1 * n2 * n3)
class Solution 
{ 
    int n1, n2, n3;
    int[][][] t;
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        t = new int[n1 + 1][n2 + 1][n3 + 1];
        for(int[][] arr1: t){
            for(int[] arr2: arr1){
                Arrays.fill(arr2, -1);
            }
        }
        return solve(A, B, C, 0, 0, 0);
    }
    
    int solve(String A, String B, String C, int i, int j, int k){
        if(i == n1 || j == n2 || k == n3){
            return 0;
        }
        
        if(t[i][j][k] != -1){
            return t[i][j][k];
        }
        
        if(A.charAt(i) == B.charAt(j) && B.charAt(j) == C.charAt(k)){
            return 1 + solve(A, B, C, i + 1, j + 1, k + 1);
        }
        
        int not_taken_i = solve(A, B, C, i + 1, j, k);
        int not_taken_j = solve(A, B, C, i, j + 1, k);
        int not_taken_k = solve(A, B, C, i, j, k + 1);
        
        return t[i][j][k] = Math.max(Math.max(not_taken_i, not_taken_j), not_taken_k);
    }
}