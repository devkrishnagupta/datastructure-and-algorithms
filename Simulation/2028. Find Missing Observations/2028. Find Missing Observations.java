// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int mObservations = Arrays.stream(rolls).boxed().mapToInt(Integer::valueOf).sum();
        int nObservations = mean * (m + n) - mObservations;
        
        if(nObservations < n || nObservations > n * 6){
            return new int[]{};
        }
        
        List<Integer> list = solve(nObservations, n, new ArrayList<>());
        return list.stream().mapToInt(n1 -> n1).toArray();
    }
    
    public List<Integer> solve(int sum, int n, List<Integer> list){
        if(n == 0 && sum == 0){
            return new ArrayList<>(list);
        }
        
        if(n == 0 && sum != 0){
            return new ArrayList<>();
        }
        
        for(int i = 1; i <= 6; i++){
            list.add(i);
            List<Integer> curr = solve(sum - i, n - 1, list);
            if(curr.size() > 0){
                return curr;
            }
            list.remove(Integer.valueOf(i));
        }
        
        return new ArrayList<>();
    }
}

// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    private Map<String, List<Integer>> memo = new HashMap<>();
    
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int mObservations = Arrays.stream(rolls).boxed().mapToInt(Integer::valueOf).sum();
        int nObservations = mean * (m + n) - mObservations;
        
        if(nObservations < n || nObservations > n * 6){
            return new int[]{};
        }
        
        List<Integer> list = solve(nObservations, n, new ArrayList<>());
        return list.stream().mapToInt(n1 -> n1).toArray();
    }
    
    public List<Integer> solve(int sum, int n, List<Integer> list){
        String key = sum + "," + n;  // Memoization key
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if(n == 0 && sum == 0){
            return new ArrayList<>(list);
        }
        
        if(n == 0 && sum != 0){
            return new ArrayList<>();
        }
        
        for(int i = 1; i <= 6; i++){
            list.add(i);
            List<Integer> curr = solve(sum - i, n - 1, list);
            if(curr.size() > 0){
                memo.put(key, curr);
                return curr;
            }
            list.remove(Integer.valueOf(i));
        }
        memo.put(key, new ArrayList<>());
        return new ArrayList<>();
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1) For Answer Only
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int mObservations = 0;
        
        // Calculate sum of existing observations
        for (int roll : rolls) {
            mObservations += roll;
        }
        
        // Calculate the required sum of the missing rolls
        int nObservations = mean * (m + n) - mObservations;
        
        // If nObservations is out of the possible bounds, return empty array
        if (nObservations < n || nObservations > n * 6) {
            return new int[]{};
        }
        
        // Calculate the average value and the remainder
        int[] result = new int[n];
        int avg = nObservations / n;
        int remainder = nObservations % n;
        
        // Fill the result array
        for (int i = 0; i < n; i++) {
            result[i] = avg + (i < remainder ? 1 : 0);
        }
        
        return result;
    }
}
