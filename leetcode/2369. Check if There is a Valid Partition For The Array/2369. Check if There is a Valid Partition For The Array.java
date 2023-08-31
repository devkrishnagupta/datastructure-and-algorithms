//Approach-1 (Using recursion)
class Solution {
    public boolean validPartition(int[] nums) {
        return solve(0, nums.length-1, nums);
    }
    
    public boolean solve(int i, int j, int[] nums){
        if(i==j)return false;//length=1
        if(i+1==j)return nums[i]==nums[j];//length=2
        if(i+2==j){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
                return true;
            if(nums[i]+1==nums[i+1] && nums[i]+2==nums[i+2])
                return true;
            return false;
        }
        return (solve(i, i+1, nums) && solve(i+2, j, nums)) || (solve(i, i+2, nums) && solve(i+3, j, nums));
    }
}

//Approach-2 (using recursion + dp)//memory limit exceeded
class Solution {
    int[][] memo;
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        memo=new int[n+1][n+1];
        for(int[] arr: memo)
            Arrays.fill(arr, -1);
        return solve(0, nums.length-1, nums);
    }
    
    public boolean solve(int i, int j, int[] nums){
        if(i==j)return false;//length=1
        if(i+1==j)return nums[i]==nums[j];//length=2
        if(i+2==j){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
                return true;
            if(nums[i]+1==nums[i+1] && nums[i]+2==nums[i+2])
                return true;
            return false;
        }
        if(memo[i][j]!=-1)return memo[i][j]==1;
        memo[i][j]=((solve(i, i+1, nums) && solve(i+2, j, nums)) || (solve(i, i+2, nums) && solve(i+3, j, nums))) ? 1 : 0;
        return memo[i][j]==1;
    }
}

//Approach-3 (as J is not changes)
class Solution {
    int[] memo;
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        memo=new int[n+1];
        Arrays.fill(memo, -1);
        return solve(0, nums.length-1, nums);
    }
    
    public boolean solve(int i, int j, int[] nums){
        if(i==j)return false;//length=1
        if(i+1==j)return nums[i]==nums[j];//length=2
        if(i+2==j){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
                return true;
            if(nums[i]+1==nums[i+1] && nums[i]+2==nums[i+2])
                return true;
            return false;
        }
        if(memo[i]!=-1)return memo[i]==1;
        memo[i]=((solve(i, i+1, nums) && solve(i+2, j, nums)) || (solve(i, i+2, nums) && solve(i+3, j, nums))) ? 1 : 0;
        return memo[i]==1;
    }
}

//Approach-4 (as J is not changes)
class Solution {
    Boolean[] memo;
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        memo=new Boolean[n+1];
        return solve(0, nums.length-1, nums);
    }
    
    public boolean solve(int i, int j, int[] nums){
        if(i==j)return false;//length=1
        if(i+1==j)return nums[i]==nums[j];//length=2
        if(i+2==j){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
                return true;
            if(nums[i]+1==nums[i+1] && nums[i]+2==nums[i+2])
                return true;
            return false;
        }
        if(memo[i]!=null)return memo[i];
        return memo[i]=(solve(i, i+1, nums) && solve(i+2, j, nums)) || (solve(i, i+2, nums) && solve(i+3, j, nums));
    }
}

//Approach-5
//Time => 3^n
//Space => n
class Solution {
    public boolean validPartition(int[] nums) {
        return solve(nums, 0, new Boolean[nums.length]);
    }
    
    public boolean solve(int[] nums, int i, Boolean[] dp){
        if(i == nums.length)
            return true;
        
        if(dp[i] != null)
            return dp[i];

        boolean result = false;
        
        if((i + 1) < nums.length && (nums[i] == nums[i+1]))
            result |= solve(nums, i+2, dp);
        
        if((i + 2) < nums.length && nums[i] == nums[i+1] && nums[i+1] == nums[i+2])
            result |= solve(nums, i+3, dp);
        
        if((i + 2) < nums.length && ((nums[i] + 1) == nums[i+1]) && ((nums[i] + 2) == nums[i+2]))
            result |= solve(nums, i+3, dp);

        return dp[i] = result;
    }
}

//Approach-6 (Bottom Up)