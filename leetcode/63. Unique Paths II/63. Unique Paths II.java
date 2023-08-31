//Approach-1 (Without memorization)
class Solution {
    int count=0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length, n=obstacleGrid[0].length;
        solve(0, 0, m-1, n-1, obstacleGrid);
        return count;
    }
    
    public void solve(int i, int j, int m, int n, int[][] grid){
        if(i>m || j> n || grid[i][j]==1)
            return;
        if(i==m && j==n){
            count++;
            //return;//optional
        }
        solve(i+1, j, m, n, grid);
        solve(i, j+1, m, n, grid);
    }
}

//Approach-2 (Using Recursion)
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length, n=obstacleGrid[0].length;
        return solve(0, 0, m-1, n-1, obstacleGrid);
    }
    
    public int solve(int i, int j, int m, int n, int[][] grid){
        if(i>m || j> n || grid[i][j]==1)
            return 0;
        if(i==m && j==n){
            return 1;
        }
        int left = solve(i+1, j, m, n, grid);
        int right = solve(i, j+1, m, n, grid);
        return left+right;
    }
}

//Approach-3 (Using recursion+Memorization)
class Solution {
    Integer[][] memo;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length, n=obstacleGrid[0].length;
        memo=new Integer[m][n];
        return solve(0, 0, m-1, n-1, obstacleGrid);
    }
    
    public int solve(int i, int j, int m, int n, int[][] grid){
        if(i>m || j> n || grid[i][j]==1)
            return 0;
        if(i==m && j==n){
            return 1;
        }
        if(memo[i][j]!=null)
            return memo[i][j];
        int left = solve(i+1, j, m, n, grid);
        int right = solve(i, j+1, m, n, grid);
        return memo[i][j]=left+right;
    }
}

//Approach-4 (Bottom Up). T.C : O(m*n)
class Solution {
public:
    int m, n;

    //Tabular approach
    int solve(vector<vector<int>>& obstacleGrid) {
        vector<vector<int>> t(m, vector<int>(n, 0));
        if(obstacleGrid[0][0] == 1)
            return 0;
        
        for(int col = 0; col<n; col++) {
            if(col > 0 && obstacleGrid[0][col-1] == 1) {
                t[0][col] = 0;
                obstacleGrid[0][col] = 1; //Bcz now it's not possible to reach any cell in first row from this cell onwards
            }
            else if(obstacleGrid[0][col] == 1)
                t[0][col] = 0;
            else
                t[0][col] = 1;
        }
        
        for(int row = 0; row<m; row++) {
            if(row > 0 && obstacleGrid[row-1][0] == 1) {
                t[row][0] = 0;
                obstacleGrid[row][0] = 1; //Bcz now it's not possible to reach any cell in first col from this cell onwards
            }
            else if(obstacleGrid[row][0] == 1)
                t[row][0] = 0;
            else
                t[row][0] = 1;
        }
        
        for(int i = 1; i<m; i++) {
            for(int j = 1; j<n; j++) {
                if(obstacleGrid[i][j] == 1)
                    t[i][j] = 0;
                else
                    t[i][j] = t[i-1][j] + t[i][j-1];
            }
        }
        return t[m-1][n-1];
    }
    
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        m = obstacleGrid.size();
        n = obstacleGrid[0].size();
        
        return solve(obstacleGrid);
        
    }
};
