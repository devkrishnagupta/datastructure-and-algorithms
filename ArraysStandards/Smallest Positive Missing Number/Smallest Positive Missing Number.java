// Approach-1 (Using Set)
// T.C : O(n)
// S.C : O(n)

// Approach-2 (Using Sorting)
// T.C : O(n * logN)
// S.C : O(1)

// Approach-3 (Optimal)
// T.C : O(n)
// T.C : O(1)
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }
        }
        for(int i=1;i<=n;i++){
            if(i!=arr[i-1]) return i;
        }
        return n+1;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}