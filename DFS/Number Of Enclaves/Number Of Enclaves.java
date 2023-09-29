//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java



//Time => n*m
//Space => n*m
class Solution {

    int ans;
    int[] dx={0, 1, -1, 0};
    int[] dy={1, 0, 0, -1};
    int numberOfEnclaves(int[][] grid) {

        // Your code here
        ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(grid, i, 0, n, m, vis);
        }
        for(int i=0;i<n;i++){
            dfs(grid, i, m-1, n, m, vis);
        }
        for(int i=0;i<m;i++){
            dfs(grid, 0, i, n, m, vis);
        }
        for(int i=0;i<m;i++){
            dfs(grid, n-1, i, n, m, vis);
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    void dfs(int[][] grid, int i, int j, int n, int m, boolean[][] vis){
        if(i>=0 && j>=0 && i<n && j<m && grid[i][j]==1){
            for(int c=0;c<4;c++){
                int x = i+dx[c];
                int y = j+dy[c];
                if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1 && !vis[x][y]){ 
                    vis[x][y]=true;
                    dfs(grid, x, y, n, m, vis);
                }
            }
        }
    }
}