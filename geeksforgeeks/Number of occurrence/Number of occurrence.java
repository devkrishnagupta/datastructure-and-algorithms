//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends
//User function Template for Java

//Time => n
//Space => 1
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count=0;
        for(int val: arr)
            if(val==x)count++;
        return count;
    }
}


//Time => n
//Space => n
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int val: arr)
            map.put(val, map.getOrDefault(val, 0)+1);
        return map.containsKey(x) ? map.get(x) : 0;
    }
}

//Time => n
//Space => 1
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int start=-1;
        int end=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               start=i;
               break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
               end=i;
               break;
            }
        }
        return start!=-1 ? end-start+1 : 0;
    }
}


//Time => Log(n)
//Space => 1
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int low=l_idx(arr, n, x);
        int high=h_idx(arr, n, x);
        if(low==-1)return 0;
        return high-low+1;
    }
    
    int h_idx(int[] arr, int n, int x){
        int idx=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]==x){
                idx=mid;
                low=mid+1;
            }else{
                low=mid+1;
            }
        }
        return idx;
    }
    
    int l_idx(int[] arr, int n, int x){
        int idx=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]==x){
                idx=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return idx;
    }
}