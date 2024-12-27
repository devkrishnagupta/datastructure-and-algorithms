// Approach-1 (Brute Force, Two Loop)
// T.C : O(n * n)
// S.C : O(1)


// Approach-2 (Optimal, HashMap)
// T.C : O(n)
// S.C : O(n)
class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int val: arr){
            if(map.containsKey(target - val))
                ans += map.get(target - val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return ans;
    }
}