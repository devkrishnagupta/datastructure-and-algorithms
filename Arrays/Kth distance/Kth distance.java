// Approach-1 (Using Map)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i]) <= k) return true;
            }
            map.put(arr[i], i);
        }
        
        return false;
    }
}
