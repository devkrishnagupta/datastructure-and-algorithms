// Approach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public int firstMissingPositive(int[] nums) {
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        int idx = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] != idx){
                    return idx;
                }else{
                    idx++;
                }
            }
        }
        return idx;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean[] bool = new boolean[n + 2];
        
        for(int i = 0; i < n; i++){
            if(nums[i] > 0 & nums[i] < n + 2){
                bool[nums[i]] = true;
            }
        }
        
        for(int i = 1; i < n + 2; i++){
            if(!bool[i]){
                return i;
            }
        }
        
        return n + 3;
    }
}

// Approach-3
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean contains1 = false;

        for (int i = 0; i < n; i++) {
            // Check whether 1 is in the original array
            if (nums[i] == 1) {
                contains1 = true;
            }
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        if (!contains1) return 1;

        // Mark whether integers 1 to n are in nums
        // Use index as a hash key and negative sign as a presence detector.
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if (nums[idx] < 0) continue;
            nums[idx] *= -1;
        }

        // First positive in nums is smallest missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i + 1;
        }

        return n + 1;
    }
}