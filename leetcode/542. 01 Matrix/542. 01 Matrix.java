class Solution {
    int m,n;
    int[][] directions={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int[][] updateMatrix(int[][] mat) {
        m=mat.length;
        n=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    ans[i][j]=0;
                    q.add(new int[]{i, j});
                }else
                    ans[i][j]=-1;
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.peek();
            q.remove();
            for(int dir[]: directions){
                int new_i=curr[0]+dir[0];
                int new_j=curr[1]+dir[1];
                if(new_i>=0 && new_i<m && new_j>=0 && new_j<n && ans[new_i][new_j]==-1){
                    ans[new_i][new_j]=ans[curr[0]][curr[1]]+1;
                    q.add(new int[]{new_i, new_j});
                }
            }
        }
        return ans;
    }
}

