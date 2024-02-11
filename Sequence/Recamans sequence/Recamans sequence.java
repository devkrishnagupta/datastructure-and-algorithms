//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(n == 0)
            return ans;
            
        ans.add(0);
        set.add(0);
        
        for(int i = 1; i <= n; i++){
            int temp = ans.get(i - 1) - i;
            if(temp > 0 && !set.contains(temp)){
                set.add(temp);
                ans.add(temp);
            }else{
                int temp2 = ans.get(i - 1) + i;
                ans.add(temp2);
                set.add(temp2);
            }
        }
        
        return ans;
    }
}