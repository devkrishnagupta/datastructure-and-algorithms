// Approach-1 (Brute Force)
// T.C : O(n * n * n)
// S.C : O(1)
// find all the sub array's and find sum of the arrays and check whether it is requal to goal or not

// Approach-2 (Cumulative sum)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        
        // HashMap to store cumulative sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        int currSum = 0;
        map.put(0, 1);
        for (int num : nums) {
            currSum += num;

            // If there is a previous sum such that (current sum - previous sum) equals goal, increment count by the frequency of that previous sum
            if (map.containsKey(currSum - goal)) {
                count += map.get(currSum - goal);
            }
            
            // Increment the frequency of current sum in the map
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        
        return count;
    }
}

// Approach-2 (Sliding Window)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        
        int i = 0;
        int j = 0;
        
        int windowSum = 0;
        int countZero = 0;
        int result = 0;
        
        while(j < n){
            
            windowSum += nums[j];
            
            while(i < j && (nums[i] == 0 || windowSum > goal)){
                
                if(nums[i] == 0){
                    countZero++;
                }else{
                    countZero = 0;
                }
                
                windowSum -= nums[i];
                i++;
            }
            
            if(windowSum == goal){
                result += 1 + countZero;
            }
            
            j++;
        }
        
        return result;
        
    }
}