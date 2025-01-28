// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> permutations = new HashSet<>();
        solve(s, "", permutations);
        return new ArrayList<>(permutations);
    }
    
    public void solve(String s, String temp, Set<String> permutations){
        if(s.length() <= 1){
            permutations.add(temp + s);
            return;
        }
        
        for(int idx = 0; idx < s.length(); idx++){
            String str = s.substring(0, idx) + s.substring(idx + 1);
            solve(str, temp + s.charAt(idx), permutations);
        }
    }
}

// Approach-2
// T.C : O()
// S.C : O()
class Solution {
    public ArrayList<String> findPermutation(String s) {
        Set<String> permutations = new HashSet<>();
        char[] arr = s.toCharArray();
        solve(arr, 0, permutations);
        return new ArrayList<>(permutations);
    }

    public void solve(char[] arr, int index, Set<String> permutations) {
        // Base case: if we've processed all characters, add the permutation
        if (index == arr.length) {
            permutations.add(new String(arr));
            return;
        }

        // Iterate through all possible swaps
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates (important for handling repeated characters)
            if (i != index && arr[i] == arr[index]) continue;

            // Swap characters at index and i
            swap(arr, index, i);

            // Recursively generate permutations
            solve(arr, index + 1, permutations);

            // Backtrack (swap back)
            swap(arr, index, i);
        }
    }

    // Helper method to swap characters in the array
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}