// Approach-1 (Linear Scan)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }else if(arr[i] > k){
                return i;
            }
        }
        
        return arr.length;
    }
};

// Approach-2 (Binary Search)
// T.C : O(logN)
// S.C : O(1)
class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
};