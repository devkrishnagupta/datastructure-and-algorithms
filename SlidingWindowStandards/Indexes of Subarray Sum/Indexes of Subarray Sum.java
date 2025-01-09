// Approach-1 (Sliding Window)
// T.C : O(n)
// S.C : O(1)
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        // Iterate through the array with two pointers
        while(j < n){
            sum += arr[j];
            
            // If sum matches the target return the 1-based indexs
            while(sum > target && i <= j){
                sum -= arr[i++];
            }
            
            if(sum == target){
                ans.add(i + 1);
                ans.add(j + 1);
                return ans;
            }
            j++;
        }
        
        // If no subarray sum equals the target, return [-1]
        ans.add(-1);
        
        return ans;
    }
}