// Approach-1
// T.C : O(n * n)
// S.C : O(n)
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], i);
        }
        
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum = arr[i] + arr[j];
                int key = -1 * sum;
                if(map.containsKey(key)){
                    int idx = map.get(key);
                    if(idx != i && idx != j){
                        List<Integer> triplet = Arrays.asList(i, j, idx);
                        Collections.sort(triplet);
                        ans.add(triplet);
                    }
                }
            }
        }
        
        return new ArrayList(ans);
    }
}