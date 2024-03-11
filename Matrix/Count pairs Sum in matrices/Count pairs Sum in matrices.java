//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Approach-1 (Find All possible pair and sum of it)
// T.C : O(n * n * n * n)
// S.C : O(1)
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int ans = 0;
        
        for(int i1 = 0; i1 < n; i1++){
            for(int j1 = 0; j1 < n; j1++){
                for(int i2 = 0; i2 < n; i2++){
                    for(int j2 = 0; j2 < n; j2++){
                        if(mat1[i1][j1] + mat2[i2][j2] == x){
                            ans++;
                        }
                    }    
                }
            }    
        }
        
        return ans;
    }
}

// Approach-2 (x - mat1[i][j] == result & add this result in set to check in time O(1) present or not of element of second matrix)
// T.C : o(n * n)
// S.C : o(n * n)
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int ans = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                set.add(x - mat1[i][j]);
            }    
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(set.contains(mat2[i][j])){
                    ans++;
                }
            }    
        }
        
        return ans;
    }
}

// Approach-3 (Two Pointer)
// T.C : o(n * n)
// S.C : o(1)
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int ans = 0;
        
        int i1 =0, j1 = 0;
        int i2 = n - 1, j2 = n - 1;
        
        while(i1 < n && j1 < n && i2 >= 0 && j2 >= 0){
            int currSum = mat1[i1][j1] + mat2[i2][j2];
            if(currSum == x){
                ans++;
                if(j2 == 0){
                    i2--;
                    j2 = n-1;
                }else{
                    j2--;
                }
                if(j1 == n-1){
                    i1++;
                    j1 = 0;
                }else{
                    j1++;
                }
            }else if(currSum > x){
                if(j2 == 0){
                    i2--;
                    j2 = n-1;
                }else{
                    j2--;
                }
            }else{
                if(j1 == n-1){
                    i1++;
                    j1 = 0;
                }else{
                    j1++;
                }
            }
        }
        
        return ans;
    }
}

// Approach-3 (Two Pointer with optimized code)
// T.C : o(n * n)
// S.C : o(1)
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int ans = 0;
        
        int i1 =0, j1 = 0;
        int i2 = n - 1, j2 = n - 1;
        
        while(i1 < n && i2 >= 0){
            int currSum = mat1[i1][j1] + mat2[i2][j2];
            if(currSum == x){
                ans++;
                j1++;
                j2--;
            }else if(currSum > x){
                j2--;
            }else{
                j1++;
            }
            i1 = j1 == n ? i1 + 1 : i1;
            j1 %= n;
            i2 = j2 == -1 ? i2 - 1 : i2;
            j2 = j2 == -1 ? n - 1 : j2;
        }
        
        return ans;
    }
}