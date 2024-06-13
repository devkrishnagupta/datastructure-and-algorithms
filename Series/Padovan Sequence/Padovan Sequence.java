// Approach-1
// T.C : O(n)
// S.C : O(n)

class Solution
{
    int mod = 1000000007;
    
    public int padovanSequence(int n)
    {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 3]) % mod;
        }

        return dp[n];
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution
{
    int mod = 1000000007;
    
    public int padovanSequence(int n)
    {
        if(n < 3){
            return 1;
        }
        int a = 1, b = 1, c = 1;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = (a + b) % mod;
            a = b;
            b = c;
            c = temp;
        }

        return temp;
    }
}