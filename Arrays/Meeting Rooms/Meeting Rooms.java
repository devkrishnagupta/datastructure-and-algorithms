// Approach-1
// S.C : O(n * logN)
// S.C : O(1)
class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1][1] > arr[i][0])
                return false;
        }
        
        return true;
    }
}