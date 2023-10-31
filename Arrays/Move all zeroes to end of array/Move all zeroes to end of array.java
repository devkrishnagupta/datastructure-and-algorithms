//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java





//User function Template for Java


// Time n*n
// Space 1
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==0){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
    }
}

// Time n
// Space n
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
	    if(n==1)return;
	    int[] temp=new int[n];
	    int start=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            temp[start++]=arr[i];
	        }
	    }
	    start=0;
	    for(int val: temp){
	        arr[start++]=val;
	    }
    }
}

// Time n
// Space 1
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
	    if(n==1)return;
	    int start=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            int temp=arr[i];
	            arr[i]=arr[start];
	            arr[start]=temp;
	            start++;
	        }
	    }
    }
}