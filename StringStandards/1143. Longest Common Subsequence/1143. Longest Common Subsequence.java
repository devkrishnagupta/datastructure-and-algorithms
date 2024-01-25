//Approach-1 (Recusion)
// T.C : O(2^m * 2^n) ~ O(2^(m+n)) ~ every m & n has two possibility
// S.C : O(2^(m+n)) ~ recusive call stack
class Solution {
    
    int m,n;
    
    public int longestCommonSubsequence(String text1, String text2) {
        m = text1.length();
        n = text2.length();
        
        return solve(text1, text2, 0, 0);
    }
    
    public int solve(String text1, String text2, int i, int j){
        
        if(i >= m || j >= n){
            return 0;
        }
        
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + solve(text1, text2, i + 1, j + 1);
        }
        
        int include_i = solve(text1, text2, i, j + 1);
        int include_j = solve(text1, text2, i + 1, j);
        
        return Math.max(include_i, include_j);
    }
}

// Approach-2 (Recusion + Memorization)
// T.C : O(2^m * 2^n) ~ O(2^(m+n)) ~ every m & n has two possibility
// S.C : O(M * N)
class Solution {
    
    int m,n;
    int[][] t;
    
    public int longestCommonSubsequence(String text1, String text2) {
        m = text1.length();
        n = text2.length();
        t = new int[m + 1][n + 1];
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        return solve(text1, text2, m, n);
    }
    
    public int solve(String text1, String text2, int m, int n){
        
        if(m == 0 || n == 0){
            return 0;
        }
        
        if(t[m][n] != -1){
            return t[m][n];
        }
        
        if(text1.charAt(m - 1) == text2.charAt(n - 1)){
            return t[m][n] = 1 + solve(text1, text2, m - 1, n - 1);
        }
        
        int include_m = solve(text1, text2, m, n - 1);
        int include_n = solve(text1, text2, m - 1, n);
        
        return t[m][n] = Math.max(include_m, include_n);
    }
}

// Approach-3 (Recusion + Memorization)
// T.C : O(2^m * 2^n) ~ O(2^(m+n)) ~ every m & n has two possibility
// S.C : O(M * N)
class Solution {
    
    int m,n;
    int[][] t;
    
    public int longestCommonSubsequence(String text1, String text2) {
        m = text1.length();
        n = text2.length();
        t = new int[m + 1][n + 1];
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        return solve(text1, text2, 0, 0);
    }
    
    public int solve(String text1, String text2, int i, int j){
        
        if(i >= m || j >= n){
            return 0;
        }
        
        if(t[i][j] != -1){
            return t[i][j];
        }
        
        if(text1.charAt(i) == text2.charAt(j)){
            return t[i][j] = 1 + solve(text1, text2, i + 1, j + 1);
        }
        
        int include_i = solve(text1, text2, i, j + 1);
        int include_j = solve(text1, text2, i + 1, j);
        
        return t[i][j] = Math.max(include_i, include_j);
    }
}

// Approach-4 (Bootom up)
// T.C : O(M * N)
// S.C : O(M + N)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] t = new int[m + 1][n + 1];
        
        //First row and first column will be zero
        for(int row = 0; row < m + 1; row++){
            t[row][0] = 0;
        }
        for(int col = 0; col < n + 1; col++){
            t[0][col] = 0;
        }
        
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    t[i][j] = 1 + t[i - 1][j - 1];
                }else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        
        return t[m][n];
    }
}


/*
Since, in bottm up approach, we are using results of only two rows, t[i] and t[i-1]. So, we can take only two rows.
*/
//Approach-3 (Bottom Up space optmized)
//T.C : O(m*n)
//S.C : O(n)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] t = new int[2][n+1];
        
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if (i == 0 || j == 0) {
                    t[i % 2][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    t[i % 2][j] = 1 + t[(i + 1) % 2][j - 1];
                } else {
                    t[i % 2][j] = Math.max(t[i % 2][j - 1], t[(i + 1) % 2][j]);
                }
            }
        }
        
        return t[m % 2][n];
    }
}