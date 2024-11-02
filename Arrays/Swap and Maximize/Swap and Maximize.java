// Approach-1 (Using Sorting, Greedy)
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public long maxSum(Long[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        int i = 0;
        int j = n - 1;
        long sum = 0;
        while(i < j){
            sum += arr[j] - arr[i];
            sum += arr[j] - arr[i + 1];
            i++;
            j--;
        }

        sum += arr[n/2] - arr[0];
        
        return sum;
    }
}