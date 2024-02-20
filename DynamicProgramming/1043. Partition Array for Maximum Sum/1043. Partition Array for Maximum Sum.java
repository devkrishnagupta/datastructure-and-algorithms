// Approach-1 (Recursion)
// T.C : O(k ^ n)   ~   exponential   ~   For every index there is k possible sub-arrays 
// S.C : O(N)   ~   Size of Stack(Function call)
class Solution {
    int n, k;
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.n = arr.length;
        this.k = k;    
        return solve(arr, 0);
    }
    
    public int solve(int[] arr, int idx){
        if(idx >= n){
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        
        for(int i = idx; i < idx + k && i < n; i++){
            max = Math.max(arr[i], max);
            int temp = (i - idx + 1) * max + solve(arr, i + 1);
            result = Math.max(result, temp);
        }
        
        return result;
    }
}

//Approach-2 (Recusrion + Memorization)
// T.C : O(n * k)   ~   total states that can be form and these state multipled with k
// S.C : O(n)
//Approach-1 (Recursion + Memo)
//T.C : With Memoization - O(n*k) -> We visit only n states in dp array and everytime run a for loop of size k
//      Without Memoization - We have 2 options at each index - O(k^n) - Since the recursion tree has a branching factor of k, and the depth of the recursion tree is at most n
class Solution {
    int n, k;
    int[] t;
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.n = arr.length;
        this.k = k;
        t = new int[n + 1];
        Arrays.fill(t, -1);
        return solve(arr, 0);
    }
    
    public int solve(int[] arr, int idx){
        if(idx >= n){
            return 0;
        }
        
        if(t[idx] != -1)
            return t[idx];
        
        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        
        for(int i = idx; i < idx + k && i < n; i++){
            max = Math.max(arr[i], max);
            int temp = (i - idx + 1) * max + solve(arr, i + 1);
            result = Math.max(result, temp);
        }
        
        return t[idx] = result;
    }
}

//Approach-3 (Bottom up)
// T.C : 
// S.C : O(n)
// t[i]     ~      Maximum sum by partitioning the array of size
class Solution {
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] t = new int[n + 1];
        // t[i] = max sum for partitioning an array of size i
        
        for(int size = 1; size <= n; size++){
            
            int currMax = -1;
            for(int j = 1; j <= k && size -j >= 0; j++){
                currMax = Math.max(currMax, arr[size - j]);
                
                t[size] = Math.max(t[size], (j * currMax) + t[size - j]);
            }
        }
        
        return t[n];
    }
}