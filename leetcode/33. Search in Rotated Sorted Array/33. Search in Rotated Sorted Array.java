//Approach-1
class Solution {
   public int search(int[] nums, int target) {
        //min will have index of  minimum element of nums
        int min = minserach(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
             return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
    }
    
    //binary search to find target in left to right boundary
    public int search(int[] nums,int left,int right,int target){
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
    
    //smallest element index
    public int minserach(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return left;
    }
    
}

//Approach-2
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high) {
            
            int mid= low + (high-low)/2;
            
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[low] <= nums[mid]) {
                
                if(nums[low] <= target && target < nums[mid]) {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else {
                
                if(nums[mid] < target && target <= nums[high]) {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
