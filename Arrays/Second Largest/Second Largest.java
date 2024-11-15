// Approach-1
// T.C : O(2 * n)   ~   O(n)
// S.C : O(1)
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int fl = arr[0];
        for(int val: arr){
            fl = Math.max(val, fl);
        }
        
        int sl = -1;
        for(int val: arr){
            if(val < fl && val > sl){
                sl = val;
            }
        }
        
        return sl;
    }
}

// Approach-2 (Optimized)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int fl = arr[0];
        int sl = -1;
        for (int val : arr) {
            if (val > fl) {
                sl = fl;
                fl = val;
            } else if (val > sl && val < fl) {
                sl = val;
            }
        }
        
        return sl;
    }
}