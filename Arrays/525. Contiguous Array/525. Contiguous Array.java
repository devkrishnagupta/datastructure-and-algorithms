// Approach-1 (Recursion)
// T.C : O(2 ^ n)
// S.C : O(2 ^ n)
// TLE
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int one = (int) Arrays.stream(nums).sum();
        int zero = n - one;
        
        return solve(nums, one, zero, 0, n - 1);
    }
    
    public int solve(int[] nums, int one, int zero, int i, int j){
        if(one == zero) return j - i + 1;
        if(i == j) return 0;
        int left = nums[i] == 0 ? solve(nums, one, zero - 1, i + 1, j) : solve(nums, one - 1, zero, i + 1, j);
        int right = nums[j] == 0 ? solve(nums, one, zero - 1, i, j - 1) : solve(nums, one - 1, zero, i, j - 1);
        return Math.max(left, right);
    }
}

// Approach-2 (Recursion + Memorization)
// T.C : O(2 ^ n)
// S.C : O(2 ^ n)
// TLE
class Solution {
    Map<String, Integer> map;
    public int findMaxLength(int[] nums) {
        map = new HashMap<>();
        int n = nums.length;
        int one = (int) Arrays.stream(nums).sum();
        int zero = n - one;
        
        return solve(nums, one, zero, 0, n - 1);
    }
    
    public int solve(int[] nums, int one, int zero, int i, int j){
        if(one == zero) return j - i + 1;
        if(i == j) return 0;
        
        String key = "" + one + "-" + zero + "-" + i + "-" + j; 
        
        if(map.containsKey(key)) return map.get(key);
        
        int left = nums[i] == 0 ? solve(nums, one, zero - 1, i + 1, j) : solve(nums, one - 1, zero, i + 1, j);
        int right = nums[j] == 0 ? solve(nums, one, zero - 1, i, j - 1) : solve(nums, one - 1, zero, i, j - 1);
        int ans = Math.max(left, right);
        map.put(key, ans);
        return ans;
    }
}

// approach-3
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currSum = 0;
        int maxL = 0;
        
        mp.put(0, -1);
        
        for (int i = 0; i < n; i++) {
            currSum += (nums[i] == 1) ? 1 : -1;
            if (mp.containsKey(currSum)) {
                maxL = Math.max(maxL, i - mp.get(currSum));
            } else
                mp.put(currSum, i);
        }
        return maxL;
    }
}