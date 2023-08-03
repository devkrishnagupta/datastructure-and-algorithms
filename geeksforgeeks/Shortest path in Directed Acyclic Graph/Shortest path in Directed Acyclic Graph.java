//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


//Aproach-1 (Using Topological Sort)
class Node {
    int v,w;
    Node(int v, int w){
        this.v=v;this.w=w;
    }
}
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		List<List<Node>> adj=new ArrayList<>();
		for(int i=0; i<N;i++){
		    adj.add(new ArrayList<Node>());
		}
		for(int[] arr: edges){
		    adj.get(arr[0]).add(new Node(arr[1], arr[2]));
		}
		boolean[] vis=new boolean[N];
		Stack<Integer> st=new Stack<>();
		for(int u=0;u<N; u++){
		    if(!vis[u])
		        dfs(adj, u, st, vis);
		}
		int[] dist = new int[N];
		for(int i=0; i<N; i++){
		    dist[i]=Integer.MAX_VALUE;
		}
		dist[0]=0;
		while(!st.isEmpty()){
		    int curr = st.pop();
		    if(dist[curr] != Integer.MAX_VALUE){
		        for(Node nei: adj.get(curr)){
    		        if(dist[nei.v] > nei.w+dist[curr]){
    		            dist[nei.v]=nei.w+dist[curr];
    		        }
    		    }
		    }
		}
		for(int i=0;i<N;i++){
		    if(dist[i] == Integer.MAX_VALUE)
		        dist[i]=-1;
		}
		return dist;
	}
	
	public void dfs(List<List<Node>> adj, int u, Stack<Integer> st, boolean vis[]){
	    vis[u]=true;
	    for(Node nei: adj.get(u)){
	        if(!vis[nei.v]){
	            dfs(adj, nei.v, st, vis);
	        }
	    }
	    st.push(u);
	}
}

//Aproach-2 (Using Dijkstra Algorithm)

//Aproach-3 (Using Bell Man Ford Algorith)