// Approach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Set<Integer> set = new HashSet<>();
        for(int val: arr){
            set.add(val);
        }
        int count = 0;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] >= arr[i]){
                int increment = arr[i - 1] - arr[i] + 1;
                count += increment;
                arr[i] += increment;
            }
        }
        
        return count;
    }
}