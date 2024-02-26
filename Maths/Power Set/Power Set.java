//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


// Approach-1 (Recursion)
// T.C : O(n * (2 ^ n))
// S.C : O(n * (2 ^ n))
class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        int n = s.length();
        List<String> ans = new ArrayList<>();
        
        subseq(ans, "", s);
        
        Collections.sort(ans);
        
        return ans;
    }
    
    public void subseq(List<String> ans, String curr, String s){
        if(curr.length() == 0 && s.length() == 0){
            return;
        }
        if(s.length() == 0){
            ans.add(curr);
            return;
        }
        
        String substr = s.substring(1);
        
        subseq(ans, curr, substr);
        
        subseq(ans, curr + s.charAt(0), substr);
    }
}

// Approach-2 (Optimization of Recursion)
// T.C : O(n * (2 ^ n))     ~       O(2^n) for Recursion + sorting NlogN which (n * log2 * 2 ^n)      ~       O(n * 2^n)
// S.C : O(n * (2 ^ n))     ~       to store the substring O(2 ^n)
class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> ans = new ArrayList<>();
        
        generateSubsequence(ans, s, "", 0);
        Collections.sort(ans);
        
        return ans;
    }
    
    public void generateSubsequence(List<String> ans, String s, String curr, int idx){
        if(idx == s.length()){
            if(!curr.isEmpty()){
                ans.add(curr);
            }
            return;
        }
        
        generateSubsequence(ans, s, curr, idx + 1);
        generateSubsequence(ans, s, curr + s.charAt(idx), idx + 1);
    }
}

// Approach-3 (Binary counter to represent the inclusion or exclusion of characters at each position)
// T.C : O(n * (2 ^ n))
// S.C : O(n * (2 ^ n))
class Solution {
    public List<String> AllPossibleStrings(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();

        // The total number of subsets is 2^n
        int totalSubsets = (int) Math.pow(2, n);

        // Iterate through all possible subsets
        for (int i = 1; i < totalSubsets; i++) {
            StringBuilder current = new StringBuilder();

            // Check each bit of the binary counter
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    // Include character at position j
                    current.append(s.charAt(j));
                }
            }

            ans.add(current.toString());
        }

        Collections.sort(ans);
        return ans;
    }
}