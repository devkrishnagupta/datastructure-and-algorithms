//Approach-1
//Time -> O(N)
//Space -> O(N)
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        //Since 1 <= nums[i] <= nums.length (you can also use vector of size n to store frequency)
        int mp[] = new int[nums.length + 1];

        ArrayList<List<Integer>> result = new ArrayList<>();
        
        for (int c : nums) {
            
            if (mp[c] == result.size()) {
                result.add(new ArrayList<>());
            }

            result.get(mp[c]).add(c);
            mp[c]++;
        }

        return result;
    }
}

//Approach-1
//Time -> O(N)
//Space -> O(N)
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        //Since 1 <= nums[i] <= nums.length (you can also use vector of size n to store frequency)
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int c : nums) {
            if (map.getOrDefault(c, 0) == result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(map.getOrDefault(c, 0)).add(c);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return result;
    }
}

//Approach-1
//Time -> O(N)
//Space -> O(N)
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        int maxKey=0;
        for(int val: nums){
            int curr=map.getOrDefault(val, 0)+1;
            maxKey=Math.max(curr, maxKey);
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for(int i=0;i<maxKey;i++){
            ans.add(new ArrayList<Integer>());
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            while(count>0){
                count--;
                ans.get(count).add(entry.getKey());
            }
        }
        return ans;
    }
}