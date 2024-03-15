// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n - 1] = nums[n - 1];
        
        for(int i = 1; i < n; i++){
            left[i] = nums[i] * left[i - 1];
        }
        
        for(int j = n - 2; j >= 0; j--){
            right[j] = nums[j] * right[j + 1];
        }
        
        int[] ans = new int[n];
        
        ans[0] = right[1];
        ans[n - 1] = left[n - 2];
        
        for(int i = 1; i < n - 1; i++){
            ans[i] = left[i - 1] * right[i + 1];
        }
        
        return ans;
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)   ~   except for the ans which takes O(n) to store
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];        
        
        int leftProduct = 1;
        for(int i = 0; i < n; i++){
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        int rightProduct = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return ans;
    }
}