// Approach-1
// T.C : O(n)
// S.C : O(n)

class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n == 1)
            return 1;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int[] t: trust){
            set.add(t[0]);
        }
        
        for(int[] t: trust){
            if(!set.contains(t[1])){
                map.put(t[1], map.getOrDefault(t[1], 0) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == n -1){
                return entry.getKey();
            }
        }
        
        return -1;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freq = new int[n + 1];
        
        for(int i = 0; i < trust.length; i++){
            int v = trust[i][0];
            int u = trust[i][1];
            freq[v]--;
            freq[u]++;
        }
        
        for(int i = 1; i <= n; i++){
            if(freq[i] == n -1){
                return i;
            }
        }
        
        return -1;
    }
}