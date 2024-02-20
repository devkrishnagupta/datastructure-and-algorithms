// Approach-1 (Recursion)
// T.C : 
class Solution {
    
    int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    
    int ans;
    
    int M, N;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        M=m;
        N=n;
        return solve(maxMove, startRow, startColumn);
    }
    
    public int solve(int maxMove, int startRow, int startColumn){
        
        if(startRow < 0 || startRow >= M || startColumn < 0 || startColumn >= N){
            return 1;
        }
        
        if(maxMove <= 0){
            return 0;
        }
        
        int ans = 0;
        
        for(int i = 0; i < dir.length; i++){
            ans += solve(maxMove-1, startRow + dir[i][0], startColumn + dir[i][1]);
        }
            
        return ans;
    }
}

// Approach-2 (Recursion + Memorization)
// T.C : O()
// S.C : O()
class Solution {
    
    int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    
    int ans;
    
    int[][][] t;
    
    int mod = 1000000007;
    
    int M,N;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        M=m;
        N=n;
        t = new int[m + 1][n + 1][maxMove + 1];
        for(int[][] arr1: t){
            for(int[] arr2: arr1){
                Arrays.fill(arr2, -1);
            }
        }
        return solve(maxMove, startRow, startColumn);
    }
    
    public int solve(int maxMove, int startRow, int startColumn){
        
        if(startRow < 0 || startRow >= M || startColumn < 0 || startColumn >= N){
            return 1;
        }
        
        if(maxMove <= 0){
            return 0;
        }
        
        if(t[startRow][startColumn][maxMove] != -1){
            return t[startRow][startColumn][maxMove];
        }
        
        int ans = 0;
        
        for(int i = 0; i < dir.length; i++){
            ans = (ans + solve(maxMove-1, startRow + dir[i][0], startColumn + dir[i][1])) % mod;
        }
        
        return t[startRow][startColumn][maxMove] = ans;
    }
}