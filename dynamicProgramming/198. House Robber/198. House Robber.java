//Approach -1 (Memorization + DP)
class Solution {
    int[] t;
    public int rob(int[] nums) {
        
        int n = nums.length;
        t = new int[101];
        Arrays.fill(t, -1);
        
        return solve(nums, 0, n);
    }
    
    public int solve(int[] nums, int i, int n){
        
        if(i >= n)
            return 0;
        
        if(t[i] != -1)
            return t[i];
        
        int steal = nums[i] + solve(nums, i + 2, n);
        int skip = solve(nums, i + 1, n);
        
        return t[i] = Math.max(steal, skip);
    }
}

//Approach - 2 (Bootom Up)
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1)
            return nums[0];
        
        int[] t = new int[n + 1];
        //t[i] = max stolen memory till i house
        
        //no house  : i = 0
        t[0] = 0;
        
        //1 house : i - 1
        t[1] = nums[0];
        
        for(int i= 2; i <= n; i++){
            int steal = nums[i - 1] + t[i - 2];
            int skip = t[i - 1];
            
            t[i] = Math.max(steal, skip);
        }
        
        return t[n];
    }
}