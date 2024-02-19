//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// Approach-1
// T.C : O(n + k*logP) where n is the length of string and p is number of distinct alphabets and k number of alphabets to be removed. 
// S.C : O(n)
class Solution{
    static int minValue(String s, int k){
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int[] mm = new int[26];
        Arrays.fill(mm, 0);
        for(int i = 0; i < s.length(); i++){
            mm[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(mm[i] != 0){
                pq.add(mm[i]);
            }
        }
        
        while(k > 0){
            int temp = pq.remove();
            temp--;
            pq.add(temp);
            k--;
        }
        
        int ans = 0;
        
        while(!pq.isEmpty()){
            int temp = pq.remove();
            ans += temp * temp;
        }
        
        return ans;
    }
}