// Approach-1
// T.C : 
// S.C :
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++){
            if(i != nums[i]){
                return i;
            }
        }
        
        return n;
    }
}

// Approach-1
// T.C : 
// S.C :
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        for(int val: nums){
            set.add(val);
        }
        for(int i = 0; i < n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        
        return n;
    }
}

// Approach-1
// T.C : 
// S.C :
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int diff = ((n * (n + 1)) / 2) - sum;
        return diff;
    }
}

// Approach-1
// T.C : 
// S.C :
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n;
        
        for(int i = 0; i < n; i++){
            result = result ^ i;
            result = result ^ nums[i];
        }
        
        return result;
    }
}

// Approach-1
// T.C : 
// S.C :
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int result = n;
        int l = 0, r = n-1;
        
        while(l <= r){
            int mid = l + (r - l) / 2;
            
            if(nums[mid] > mid){
                result = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
        return result;
    }
}