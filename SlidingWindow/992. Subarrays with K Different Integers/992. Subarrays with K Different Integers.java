// Approach-1
// T.C : O(3 * n) ~ O(n)
// S.C : O(1)
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        
        int i = 0;
        int j = 0;
        
        int result = 0;
        
        
        int i_bada = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        while(j < n){
            
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            
            // Handle invalid subarray - Shrink
            while(map.size() > k){
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
                i_bada = i;                
            }
            
            // Handle to find the smallest valid subarray ending at j
            while(map.get(nums[i]) > 1){
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            
            if(map.size() == k){
                result += (1 + i - i_bada);
            }
            j++;
        }
        
        return result;
    }
}