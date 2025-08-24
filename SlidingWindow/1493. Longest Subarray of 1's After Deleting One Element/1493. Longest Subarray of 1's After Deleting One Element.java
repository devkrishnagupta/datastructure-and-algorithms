// Approach 01
// T.C : O(n * n)
// S.C : O(1)
// Brute Force
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int result = 0;
        boolean isZeroPresent = false;

        for(int i = 0; i < n; i++){

            if(nums[i] == 0){
                result = Math.max(result, findMaxOne(nums, i));
                isZeroPresent = true;
            }
        }

        return isZeroPresent == false ? n - 1 : result;
    }

    public int findMaxOne(int[] nums, int skip_idx){
        int currLength = 0;
        int maxLength = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i == skip_idx){
                continue;
            }

            if(nums[i] == 1){
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            }else{
                currLength = 0;
            }
        }

        return maxLength;
    }
}
