//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String line = sc.nextLine();
            String S = line.split(" ")[0];
            String T = line.split(" ")[1];
            
            Solution ob = new Solution();
            System.out.println(ob.subsequenceCount(S,T));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete this method*/

// Approach
class Solution
{
    int mod = 1000000007;
    int  subsequenceCount(String s, String t)
    {
    // Your code here
        return solve(s, t, 0, 0) % mod;
    }
    
    int solve(String s, String t, int i, int j){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        
        int a = 0, b = 0;
        
        if(s.charAt(i) ==  t.charAt(j)){
            a = solve(s, t, i + 1, j + 1);
        }
        b = solve(s, t, i + 1, j);
        
        return (a + b) % mod;
    }
}

// Approach-2 (Recursion + memorization)
// T.C : O(|s| * |t|)
// S.C : O(|s| * |t|)
class Solution
{
    int[][] memo;
    int mod = 1000000007;
    int  subsequenceCount(String s, String t)
    {
    // Your code here
        memo = new int[s.length()][t.length()];
        for(int[] arr: memo){
            Arrays.fill(arr, -1);
        }
        return solve(s, t, 0, 0) % mod;
    }
    
    int solve(String s, String t, int i, int j){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        
        if(memo[i][j] != -1){
            return memo[i][j];
        }
        
        int a = 0, b = 0;
        
        if(s.charAt(i) ==  t.charAt(j)){
            a = solve(s, t, i + 1, j + 1);
        }
        b = solve(s, t, i + 1, j);
        
        return memo[i][j] = (a + b) % mod;
    }
}