// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        Map<Integer, Integer> distance = new HashMap<>();
        int max = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(distance.containsKey(arr[i])){
                max = Math.max(max, i - distance.get(arr[i]));
            }else{
                distance.put(arr[i], i);
            }
        }
        
        return max;
    }
}