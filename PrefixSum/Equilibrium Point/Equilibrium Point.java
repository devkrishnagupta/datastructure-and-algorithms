// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int start = 0, end = n - 1;
        int leftSum = 0, rightSum = 0;
        
        for(int i = 0; i < n; i++){
            rightSum += arr[i];
        }
        
        for(int idx = 0; idx < n - 1; idx++){
            rightSum -= arr[idx];
            if(leftSum == rightSum){
                return idx;
            }
            leftSum += arr[idx];
        }
        
        return -1;
    }
}