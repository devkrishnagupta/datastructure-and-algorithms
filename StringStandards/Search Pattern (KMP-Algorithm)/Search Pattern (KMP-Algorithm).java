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
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Approach-1
class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int patlen = pat.length();
        int txtlen = txt.length();
        for(int i=0; i<txtlen-patlen+1;i++){
            if(pat.equals(txt.substring(i, patlen+i)))
                ans.add(i+1);
        }
        return ans;
    }
}

//Approach-2
class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int txtlen = txt.length();
        int patlen = pat.length();
        for(int i=0; i<txtlen;i++){
            int count=0;
            for(int j=0;j<patlen;j++){
                if((i+j) >= txtlen || txt.charAt(i+j)!=pat.charAt(j))
                    break;
                count++;
            }
            if(count==patlen){
                ans.add(i+1);
            }
        }
        return ans;
    }
}

//Approach-3
//(KMP Algorithm)
//T.C : O(m+n)
//S.C : O(m) where m is the length of pattern
class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = txt.length();
        int M = pat.length();

        int[] lps = computeLPS(pat);

        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < N) {
            if (j < M && pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                result.add(i - j + 1); // Pattern found at index i - j + 1 (1-based indexing)
                j = lps[j - 1];
            } else if (i < N && (j == 0 || pat.charAt(j) != txt.charAt(i))) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }

    private int[] computeLPS(String pattern) {
        int M = pattern.length();
        int[] lps = new int[M];
        int len = 0; // Length of the previous longest prefix suffix

        lps[0] = 0; // Because there is no proper suffix and prefix of pattern[0..0]

        int i = 1;
        while (i < M) {
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