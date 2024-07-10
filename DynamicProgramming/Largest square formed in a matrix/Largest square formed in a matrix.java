// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && i > 0 && j > 0) {
                    mat[i][j] = Math.min(mat[i - 1][j], Math.min(mat[i - 1][j - 1], mat[i][j - 1])) + 1;
                }
                ans = Math.max(mat[i][j], ans);
            }
        }
        return ans;
    }
}