// Approach - 1 (sliding window)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        int max = 0;
        int xor = 0;

        for(int i = 0; i < k - 1; i++){
            xor ^= arr[i];
        }
        
        for(int i = k - 1; i < n; i++){
            xor ^= arr[i];
            max = Math.max(max, xor);
            xor ^= arr[i - k + 1];
        }
        
        return max;
    }
}
