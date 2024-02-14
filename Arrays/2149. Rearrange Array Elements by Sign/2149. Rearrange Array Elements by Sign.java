// Approach-1 (Brute Force)
// T.C : O(2 * n)   ~   O(n)
// S.C : O(2 * n)   ~   O(n)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int[] ans = new int[n];
        
        int idx_p = 0;
        int idx_n = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                pos[idx_p++] = nums[i];
            }else{
                neg[idx_n++] = nums[i];
            }
        }
        
        int idx = 0;
        for(int i = 0; i < n/2; i++){
            ans[idx++] = pos[i];
            ans[idx++] = neg[i];
        }
        
        return ans;
    }
}

// Approach-2 (Without using extra space)
// T.C : O(n)
// S.C : O(n)   ~   for ans only
class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int pi = 0;
        int ni = 1;
        
        for(int num: nums){
            if(num > 0){
                ans[pi] = num;
                pi += 2;
            }else{
                ans[ni] = num;
                ni += 2;
            }
        }
        
        return ans;
    }
}
