//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//Approach-1 (Brute Force)
//Time => N
//Space => 1
class Solution {
    static int isPerfectNumber(long N) {
        // code here
        int sum=0;
        for(int i=1;i<=N/2;i++){
            if(N%i==0)
                sum+=i;
        }
        return sum==N ? 1 : 0;
    }
};

//Approach-2
//Time => sqrt(N)
//Space => 1
class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N==1)return 0;
        long sum=1;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0)
                sum+=(i+N/i);
        }
        return sum==N ? 1 : 0;
    }
};

//Ambiguity with perfect square example => N=9 => 1, 3 , 9 => But using formula it will take 3 twice and sum 1+3+3 => 7 != 9