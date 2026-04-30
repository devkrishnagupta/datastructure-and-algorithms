// Approach -1 Traverse all array and checked left and right node must be lesser
// T.C : O(n)
// S.C : O(1)
class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            
            if(leftIndex < n && arr[i] < arr[leftIndex]){
                return false;    
            }
            
            if(rightIndex < n && arr[i] < arr[rightIndex]){
                return false;
            }
        }
        return true;
    }
}


// Approach-2 No need to traverse leaf nodes as leaf nodes does not have childreen
// Last non-leaf node = (n/2 - 1), so traverse up to the (n/2 - 1) time
// T.C : O(n/2 - 1) ~ O(n)
// T.C : O(n)
class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        // Nodes from n/2 to n-1 are leaf nodes
        // only Nodes from 0 to n/2 - 1 have childreen
        int n = arr.length;
        for(int i = 0; i <= (n/2 - 1); i++){
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            
            if(arr[i] < arr[leftIndex]){
                return false;    
            }
            
            if(rightIndex < n && arr[i] < arr[rightIndex]){
                return false;
            }
        }
        
        return true;
    }
}