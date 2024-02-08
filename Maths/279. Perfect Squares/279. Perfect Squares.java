// Approach-1 (Recursion)
// T.C : 
// S.C : 
class Solution {
    int ans;
    public int numSquares(int n) {
        List<Integer> ps = new ArrayList<>();
        ans = Integer.MAX_VALUE;
        
        for(int i = 1; ; i++){
            int num = i * i;
            if(num > n){
                break;
            }
            ps.add(num);
        }
        
        solve(ps, 0, 0, n);
        
        return ans;
    }
    
    public void solve(List<Integer> ps, int count, int sum, int n){
        if(sum > n){
            return;
        }
        if(sum == n){
            ans = Math.min(ans, count);
        }
        
        for(int i = 0; i < ps.size(); i++){
            solve(ps, count + 1, sum + ps.get(i), n);
        }
    }
}

// Approach-2 (Recursion + Memorization)
// T.C : 
// S.C : 
public class Solution {
    public int minCoinsToGetS(List<Integer> coins, int n, int S, int[][] t) {
        if (t[n][S] != -1)
            return t[n][S];

        if (n == 0)
            return Integer.MAX_VALUE - 1;
        if (S == 0)
            return 0;
        if (n == 1) {
            if (S % coins.get(0) == 0)
                return t[n][S] = S / coins.get(0);
            else
                return t[n][S] = Integer.MAX_VALUE - 1;
        }

        if (coins.get(n - 1) <= S) {
            return t[n][S] = Math.min(1 + minCoinsToGetS(coins, n, S - coins.get(n - 1), t),
                    minCoinsToGetS(coins, n - 1, S, t));
        } else
            return t[n][S] = minCoinsToGetS(coins, n - 1, S, t);
    }

    public int numSquares(int S) {
        List<Integer> coins = new ArrayList<>();
        for (int i = 1; i * i <= S; i++) {
            coins.add(i * i);
        }
        int n = coins.size();

        int[][] t = new int[n + 1][S + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return minCoinsToGetS(coins, n, S, t);
    }
}

















// Wrong Answer 2, 6, 12, 25, 7168
class Solution {
    int[][] t;
    public int numSquares(int n) {
        List<Integer> ps = new ArrayList<>();
        
        for(int i = 1; ; i++){
            int num = i * i;
            if(num > n){
                break;
            }
            ps.add(num);
        }
        
        int size = ps.size();
        t = new int[n + 1][n + 1];
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        
        int ans = solve(ps, 0, 0, n, size);
        
        return ans;
    }
    
    public int solve(List<Integer> ps, int count, int sum, int n, int size){
        if(sum > n || count > size){
            return Integer.MAX_VALUE;
        }
        
        if(sum == n){
            return count;
        }
        
        if(t[count][sum] != -1){
            return t[count][sum];
        }
        
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < ps.size(); i++){
            int curr = solve(ps, count + 1, sum + ps.get(i), n, size);
            result = Math.min(result, curr);
        }
        
        return t[count][sum] = result;
    }
}