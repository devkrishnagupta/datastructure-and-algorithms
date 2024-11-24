// Approach-1 (Kadan's Algorithm)
// T.C : O(n)
// S.C : O(1)
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];

            // Use Math.max to find the maximum 
            // of maxSoFar and maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

            // Use Math.max to reset maxEndingHere 
            // to 0 if it becomes negative
            maxEndingHere = Math.max(maxEndingHere, 0);
        }
        return maxSoFar;
    }
}

// Approach-2 (Kadan's Algorithm)
// T.C : O(n)
// S.C : O(1)
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int num: arr){
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}