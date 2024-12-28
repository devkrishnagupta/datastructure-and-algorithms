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

// Approach-2
// T.C : O()
// S.C : O()
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> mm = new HashMap<>();
        for(int i=0;i<n;i++){
            mm.putIfAbsent(arr[i],new ArrayList<Integer>());
            mm.get(arr[i]).add(i);
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int rem = 0-(arr[i]+arr[j]);
                if(mm.get(rem)!=null){
                    int size=mm.get(rem).size();
                    for(int k=size-1;k>=0;k--){
                        if(mm.get(rem).get(k)<=j)break;
                        ans.add(new ArrayList<>(List.of(i,j,mm.get(rem).get(k))));
                    }
                }
            }
        }
        Collections.sort(ans,(o1, o2) -> o1.get(2).compareTo(o2.get(2)));
        return ans;
    }
}