// For N/2 (means majority element 1)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0; // Any Value
        int freq = 0;
        
        for(int i = 0; i < n; i++){
            if(freq == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                freq++;
            }else{
                freq--;
            }
        }

        //verification
        int count = 0;
        for(int val: nums){
            if(val == candidate){
                count++;
            }
        }
        candidate = count > (int) Math.floor(n/2) ? candidate : -1;
        
        return candidate;
    }
}

// For N/3 (means majority element 2)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int maj1 = 0; // Any Value
        int count1 = 0;

        int maj2 = 0; // Any Value
        int count2 = 0;

        // Searching/Finding
        for(int i = 0; i < n; i++){
            if(nums[i] == maj1){
                count1++;
            }
            if(nums[i] == maj2){
                count2++;
            }else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();

        //verification
        int freq1 = 0;
        int freq2 = 0;
        for(int val: nums){
            if(val == maj1){
                freq1++;
            }else if(val == maj2){
                freq2++;
            }
        }

        if(freq1 > (int) Math.floor(n/3)){
            ans.add(maj1);
        }
        if(freq2 > (int) Math.floor(n/3)){
            ans.add(maj2);
        }

        return ans;
    }
}