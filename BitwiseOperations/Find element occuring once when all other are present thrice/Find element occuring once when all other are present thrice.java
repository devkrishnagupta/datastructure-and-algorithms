//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Approach-1 (Brute force approach using two loops check the frequencies of number)
//Time o(N * N)
//Space o(1)

//Approach-2 (Sort the array and check three consecutive numbers is it equals or not then increment by 1)
//Time o(N * log(N))
//Space o(1)

//Approach-3 (Counting the frequencies of the number and store it and then finding the frequencies with 1)
//Time o(N)
//Space o(N)

//Approach-4 (Counting the number of set bit at each places of a 32-bit integer number)
//Time o(N)
//Space o(1)
class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int res=0;
        for(int i=0; i<32; i++){
            int count=0;
            for(int j=0;j<N;j++){
                if((arr[j] & (1<<i))!=0){
                    count++;
                }
            }
            if(count%3==1)
                res+=(1<<i);
        }
        return res;
    }
}