// Approach-1
// T.C : O(logN)
// S.C : O(1)
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int i = 0, j = n - 1;
        int start = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == target){
                start = mid;
                j = mid - 1; // Continue searching in the left half for the first occurrence
            }else if(arr[mid] > target){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        
        if(start == -1) return 0; // return if no occurrence is found
        int end = -1;
        i = 0; j = n - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == target){
                end = mid;
                i = mid + 1; // continue searching in the right half for last occurrence
            }else if(arr[mid] > target){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        
        return end - start + 1;
    }
}