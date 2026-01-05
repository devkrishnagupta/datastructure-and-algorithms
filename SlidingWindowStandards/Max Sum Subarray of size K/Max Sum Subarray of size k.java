// Approach-1 (Prefix sum)
// T.C : O()
// S.C : O()
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        
        int max = sum;
        
        for(int i = k; i < n; i++){
            sum += (arr[i] - arr[i - k]);
            max = Math.max(max, sum);
        }
        
        return max;
    }
}