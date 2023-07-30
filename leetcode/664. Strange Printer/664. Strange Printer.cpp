//Approach-1 (Recursion + Memoization)
class Solution {
public:
    int n;
    vector<vector<int>> t;
    
    int solve(int l, int r, string& s){
        if(l == r)
            return 1;
        
        else if(l > r)
            return 0;
        
        if(t[l][r] != -1)
            return t[l][r];


        int i = l+1;
        while(i <= r && s[i] == s[l])
            i++;

        if(i == r+1)
            return 1;

        int normal = 1 + solve(i,r,s);

        int aage_ka = INT_MAX;

        for(int j = i; j <= r; j++){
            if(s[l] == s[j]){
                
                int x = solve(i,j-1,s) + solve(j,r,s);
                
                aage_ka = min(aage_ka, x);
            }
        }

        return t[l][r] = min(aage_ka, normal);
    }

    int strangePrinter(string s) {
        n = s.length() ;
        
        t.resize(n,vector<int>(n+1, -1));
        
        return solve(0, n-1, s);
    }
};



//Approach 2
class Solution {
public:
    int solve(int i, int j, const string& s, vector<vector<int>>& dp) {
        if (i == j) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        int minTurns = INT_MAX;
        for (int k = i; k < j; k++) {
            minTurns = min(minTurns, solve(i, k, s, dp) + solve(k + 1, j, s, dp));
        }
        return dp[i][j] = (s[i] == s[j]) ? minTurns - 1 : minTurns;
    }
    int strangePrinter(std::string s) {
        int n = s.length();
        vector<vector<int>> dp(n, vector<int>(n, -1));
        return solve(0, n - 1, s, dp);
    }
};