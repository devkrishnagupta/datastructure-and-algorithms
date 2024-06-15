// Approach-1
// T.C : O(n * logN) + O(n) ~   O(n * logN)
// S.C : O(1)
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        
        int moves = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                moves += nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        
        return moves;
    }
}

// Approach-1 (Using Map)
// T.C : O(n * logN)
// S.C : O()
