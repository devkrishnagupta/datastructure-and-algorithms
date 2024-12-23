// Approach-1 (Binary Search at each row)
// T.C : O(n * logM)
// S.C : O(1)
class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i = 0; i <n; i++){
            int left = 0, right = m - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(mat[i][mid] == x){
                    return true;
                }else if(mat[i][mid] > x){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        
        return false;
    }
}
