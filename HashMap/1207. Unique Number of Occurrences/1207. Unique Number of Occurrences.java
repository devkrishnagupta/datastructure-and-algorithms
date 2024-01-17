//Approach-1 (Using Map and Set)
//T.C : O(n)
//S.C : O(n)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int val: arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(!set.add(entry.getValue())) return false;
        }
        
        return true;
    }
}

//Approach-2 (Using contraints that -1000 <= arr.val <= 1000)
//T.C : O(n)
//S.C : O(2000) ~ O(1)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] occurrences = new int[2001];
        
        for(int val: arr){
            int idx = val + 1000;
            occurrences[idx]++;
        }
        
        Arrays.sort(occurrences);
        
        for(int i = 1; i < 2001; i++){
            if(occurrences[i] != 0 && occurrences[i] == occurrences[i - 1])
                return false;
        }
        
        return true;
    }
}