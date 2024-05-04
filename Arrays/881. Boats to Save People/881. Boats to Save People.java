// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    int[][] dp;
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        
        Arrays.sort(people);
        
        int i = 0, j = n - 1;
        int boats = 0;
        
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            boats++;
        }
        
        return boats;
    }
}

// Approach-2 (Recursion)
// T.C : O(n * logN) + O(n) ~   O(n * logN)
// S.C : O(n * n)
class Solution {
    
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length - 1;
        
        return solve(people, i, j, limit);
    }
    
    public int solve(int[] people, int i, int j, int limit){
        if(i > j){
            return 0;
        }
        
        if(i == j){
            return 1;
        }
        
        if(people[i] + people[j] <= limit){
            return 1 + solve(people, i + 1, j - 1, limit);
        }
        
        return 1 + solve(people, i, j - 1, limit);
    }
}

// Approach-3 (Recursion + Dynamic Programming) (Memory Limit exceeded)
// T.C : O(n * logN) + O(n) ~   O(n * logN)
// S.C : O(n)
class Solution {
    int[][] dp;
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        
        Arrays.sort(people);
        
        int i = 0, j = n - 1;
        dp = new int[n][n];
        
        return solve(people, i, j, limit);
    }
    
    public int solve(int[] people, int i, int j, int limit){
        if(i > j){
            return 0;
        }
        
        if(i == j){
            return 1;
        }
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        if(people[i] + people[j] <= limit){
            return 1 + solve(people, i + 1, j - 1, limit);
        }
        
        return dp[i][j] = 1 + solve(people, i, j - 1, limit);
    }
}