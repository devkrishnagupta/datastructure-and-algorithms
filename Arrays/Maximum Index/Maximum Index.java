//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim()); // size of array
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.maxIndexDiff(arr, n)); // print the result
        }
    }
}
// } Driver Code Ends

// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] <= a[j])
                    ans = Math.max(ans, j - i);
            }
        }
        
        return ans;
    }
}

// Approach-1.1 (Better Code)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= 0; j--){
                if(a[i] <= a[j] && ans < (j - i)){
                    ans = j - i;
                    break;
                }
            }
        }
        
        return ans;
    }
}

// Approach-2 (Recursion)
// T.C : O(2 ^ n)
// S.C : O(2 ^ n)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        return solve(a, 0, n-1);
    }
    
    static int solve(int[] arr, int i , int j){
        if(i == j)
            return 0;
        if(arr[i] <= arr[j])
            return j - i;
        
        int take_i = solve(arr, i + 1, j);
        int take_j = solve(arr, i, j-1);
        
        return Math.max(take_i, take_j);
    }
}

// Approach-2 (Recursion + Memorization)
// T.C : O(n ^ n)
// S.C : O(n ^ n)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int[][] t;
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        t = new int[n][n];
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        return solve(a, 0, n-1);
    }
    
    static int solve(int[] arr, int i , int j){
        if(i == j)
            return 0;
        if(arr[i] <= arr[j])
            return j - i;
            
        if(t[i][j] != -1)
            return t[i][j];
        
        int take_i = solve(arr, i + 1, j);
        int take_j = solve(arr, i, j-1);
        
        return t[i][j] = Math.max(take_i, take_j);
    }
}

// Approach-2 (Tow Pointer)
// T.C : O(n ^ n)
// S.C : O(1)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int ans = 0;
        int low = 0, high = n - 1;
        
        while(low <= high){
            
            if(a[low] <= a[high]){
                ans = Math.max(ans, high - low);
                low++;
                high = n - 1;
            }else
                high--;
        }
        
        return ans;
    }
}

// Approach-2 (Tow Pointer)
// T.C : O(n)
// S.C : O(n)
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int right[] = new int[n]; //max, j
        int left[] = new int[n];//min, i
        left[0] = arr[0];  right[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) 
            left[i] = Math.min(arr[i], left[i - 1]);

        for (int j = n - 2; j >= 0; j--)
            right[j] = Math.max(arr[j], right[j + 1]);

        int i = 0, j = 0, ans = Integer.MIN_VALUE;
        while (j < n && i < n) 
        {
            if (left[i] <= right[j]) 
            {
                ans = Math.max(ans, j - i);
                j++;
            } 
            else
                i++;
        }
        return ans;
    }
}