// Approach-1 (Sliding Window)
// T.C : o(n)
// S.C : O(1)
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        
        int i = 0;
        int j = 0;
        
        long result = 0;
        int countMax = 0;
        
        int maxE = Arrays.stream(nums).max().getAsInt();
        
        while(j < n){
            if(nums[j] == maxE){
                countMax++;
            }
            
            while(countMax >= k){
                result += (n - j);
                
                if(nums[i] == maxE){
                    countMax--;
                }
                i++;
            }
            
            j++;
        }
            
        return result;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(n)
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxE = Arrays.stream(nums).max().getAsInt();

        int n = nums.length;

        long result = 0;

        List<Integer> maxIndices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == maxE) {
                maxIndices.add(i);
            }

            int size = maxIndices.size();
            if (size >= k) {
                int last_i = maxIndices.get(size - k);
                result += last_i + 1;
            }
        }

        return result;
    }
}