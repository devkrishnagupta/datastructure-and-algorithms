//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends


// } Driver Code Ends
//User function Template for Java

//Approach -1 (Brute force approach)
//Time => o(N * N)
//Space => o(1)



//Approach -2
//Time => o(N)
//Space => o(N)
class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int p_sum=0, ps_rem=0, ans=0;
        for(int i=0;i<n;i++){
            p_sum += a[i];
            ps_rem = p_sum%k;
            if(ps_rem==0)
                ans = Math.max(ans, i+1);
            if(ps_rem<0){//for negative Integer
                ps_rem += k;
            }
            if(map.containsKey(ps_rem))
                ans = Math.max(ans, i-map.get(ps_rem));
            else
                map.put(ps_rem, i);
        }
        return ans;
    }
 
}