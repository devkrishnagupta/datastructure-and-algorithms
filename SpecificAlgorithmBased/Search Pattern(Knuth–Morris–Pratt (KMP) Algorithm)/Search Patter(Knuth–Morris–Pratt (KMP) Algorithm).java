//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java


// Approach-1 (nuth–Morris–Pratt (KMP) Algorithm)
// T.C : O(m + n)
// S.C : o(1)
class Solution {
    ArrayList<Integer> search(String pattern, String text) {
        int p = pattern.length();
        int t = text.length();
        
        ArrayList<Integer> ans = new ArrayList<>();
        int[] lps = computeLPSArray(pattern);
        int i = 0, j = 0;
        
        while (i < t) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == p) {
                ans.add(i - j + 1);
                j = lps[j - 1];
            } else if (i < t && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return ans;
    }

    private int[] computeLPSArray(String pattern) {
        int p = pattern.length();
        int[] lps = new int[p];
        int len = 0;
        int i = 1;
        
        while (i < p) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}

// Approach-1 (Rabin-Karp Algorithm)
// T.C : O(m + n)
// S.C : o(1)