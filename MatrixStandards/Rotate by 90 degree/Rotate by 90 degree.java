// Approach-1
// T.C : O(n * n)
// S.C : O(1)
class GFG {
    static void rotate(int matrix[][]) {
        // Code Here
        int n = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}

// Approach-2
// T.C : O(n * n)
// S.C : O(1)
class GFG {
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp = mat[i][j];
                
                mat[i][j] = mat[j][n-1-i];
                mat[j][n-1-i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[n-1-j][i];
                mat[n-1-j][i]=temp;
                
            }
        }
    }
}