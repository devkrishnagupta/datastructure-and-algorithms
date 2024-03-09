//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(r * |s|)
// S.C : O(|s|)
class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        
        for(int i = 0; i < r; i++){
            
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < s.length() && sb.length() <= n; j++){
                sb.append(s.charAt(j) == '1' ? "10" : "01");
            }
            
            s = sb.toString();
        }
        
        return s.charAt(n);
    }
}