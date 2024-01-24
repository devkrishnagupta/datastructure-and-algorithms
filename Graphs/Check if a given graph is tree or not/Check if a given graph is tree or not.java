//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
    
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(u);
                edge.add(v);
                edges.add(edge);
            }
    
            Solution solution = new Solution();
            boolean result = solution.isTree(n, m, edges);
    
            if (result==true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Approach-1 (BFS)
// T.C : O(N + M)
// S.C : O(N)
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        if(m != n-1){
            return false;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge: edges){
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        
        int cnt = 1;
        int st = 0;
        
        boolean[] vis = new boolean[n];
        
        Queue<Integer> q = new LinkedList<Integer>();
        vis[st] = true;
        q.add(st);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei: adj.get(curr)){
                if(!vis[nei]){
                    vis[nei] = true;
                    cnt++;
                    q.add(nei);
                }
            }
        }
        
        return cnt == n ? true : false;
    }
}
    
//Approach-1 (DFS)
// T.C : O(N + M)
// S.C : O(N)
class Solution {
    int cnt;
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        if(m != n-1){
            return false;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge: edges){
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        
        cnt = 1;
        boolean[] vis = new boolean[n];
        dfs(adj, 0, vis);        
        return cnt == n;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, int st, boolean[] vis){
        vis[st] = true;
        for(int nei : adj.get(st)){
            if(!vis[nei]){
                cnt++;
                dfs(adj, nei, vis);
            }
        }
    }
}