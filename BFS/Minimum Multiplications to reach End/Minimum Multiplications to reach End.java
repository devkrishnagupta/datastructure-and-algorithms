//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        int[] ans=new int[100001];
        Arrays.fill(ans, -1);
        int n=arr.length;
        int mod=100000;
        Queue<Integer> q = new LinkedList<>();
        q.add(start%mod);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int temp=q.poll();
                if(temp == end)return level;
                for(int j=0;j<n;j++){
                    int toPush = (temp%mod * arr[j]%mod)%mod;
                    if(ans[toPush]==-1){
                        ans[toPush]=ans[temp]+1;
                        q.add(toPush);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
