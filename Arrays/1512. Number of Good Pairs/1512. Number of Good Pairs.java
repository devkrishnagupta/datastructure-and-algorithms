//Approach-1 (Using Brute Force)
//Time => N*N
//Space => 1
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    ans++;
            }
        }
        return ans;
    }
}

//Approach-2 (Using HashMap)
//Time => N
//Space => N
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums){
            int isFound = map.getOrDefault(num, 0);
            ans+=isFound;
            map.put(num, isFound+1);
        }
        return ans;
    }
}