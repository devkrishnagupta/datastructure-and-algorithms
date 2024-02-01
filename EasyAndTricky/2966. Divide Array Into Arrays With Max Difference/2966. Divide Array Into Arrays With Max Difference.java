// Approach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;
        
        int[][] ans = new int[n/3][3]; 
        
        Arrays.sort(nums);
        
        int idx = 0;
        
        for(int i = 0; i < n; i += 3){
//             i, i + 1, i + 2
            if(nums[i + 2] - nums[i] > k){
                return new int[][]{};
            }
            
            ans[idx++] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
        }
        
        return ans;
    }
}