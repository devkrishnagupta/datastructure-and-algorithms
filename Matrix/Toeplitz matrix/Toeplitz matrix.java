// Approach-1
// T.C : O(n * m)
// S.C : O(1)
class Solution {
    /* You are required to complete this method */
    boolean isToeplitz(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        
        // Check diagonals starting from the first row
        for (int col = 0; col < m; col++) {
            if (!toepLitzUtil(mat, 0, col, n, m)) {
                return false;
            }
        }
        
        // Check diagonals starting from the first column
        for (int row = 1; row < n; row++) {
            if (!toepLitzUtil(mat, row, 0, n, m)) {
                return false;
            }
        }
        
        return true;
    }
    
    boolean toepLitzUtil(int[][] mat, int row, int col, int n, int m) {
        int value = mat[row][col];
        while (++row < n && ++col < m) {
            if (mat[row][col] != value) {
                return false;
            }
        }
        return true;
    }
}