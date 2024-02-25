
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t > 0)
        {
            int n = in.nextInt();
            Geeks obj = new Geeks();
            System.out.println(obj.count(n));
            t--;
        }
    }
}
// } Driver Code Ends


// Complete this function!

// Approach-1 (Bottom up)
// T.C : O(n)
// S.C : O(n)
class Geeks {
    public long count(int n) {
        // Add your code here.
        long dp[] = new long [(int)n+1];
        dp[0]=1; // {} //empty set
    
        for (int i=3 ;i <=n; i++) 
            dp[i] += dp[i -  3];
            
        for (int i=5 ;i <=n; i++) 
            dp[i] += dp[i -  5];
            
        for (int i=10 ;i <=n; i++) 
            dp[i] += dp[i - 10];
        
        return dp[n];
    }
}

// Approach-2 (for combination we are using the sequence in increasing order)
// T.C : 
// S.C :
// Note: This code is working correctly
class Geeks {
    Map<String, Long> memo;

    public long count(int n) {
        memo = new HashMap<>();
        return solve(0, n, true, true);
    }

    public long solve(int sum, int n, boolean t1, boolean t2) {
        if (sum >= n) return 0;  // Corrected termination condition
        if (sum == n) return 1;

        String key = sum + "-" + t1 + "-" + t2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long n1 = t1 ? solve(sum + 3, n, true, true) : 0;
        long n2 = t2 ? solve(sum + 5, n, false, true) : 0;
        long n3 = solve(sum + 10, n, false, false);

        long result = n1 + n2 + n3;
        memo.put(key, result);
        return result;
    }
}