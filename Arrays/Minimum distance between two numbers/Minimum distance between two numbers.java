//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends

// User function Template for Java

//Time => n*n
//Space => 1
class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if((a[i]==x && a[j]==y) || (a[i]==y && a[j]==x))
                    ans = Math.min(Math.abs(i-j), ans);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}

//Time => n
//Space => 1
class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int ans=Integer.MAX_VALUE;
        int last_x=-1;
        int last_y=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                last_x=i;
                if(last_y!=-1)
                    ans = Math.min(Math.abs(last_x-last_y), ans);
            }else if(a[i]==y){
                last_y=i;
                if(last_x!=-1)
                    ans = Math.min(Math.abs(last_x-last_y), ans);
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}