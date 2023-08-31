//Approach-1
class Solution {
    int memo[][][];
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1=s1.length(), l2=s2.length(), l3=s3.length();
        if(l1+l2!=l3)return false;
        memo=new int[l1+1][l2+1][l3+1];
        return solve(0, 0, 0, l1, l2, l3, s1, s2, s3);   
    }
    
    public boolean solve(int i, int j, int k, int in, int jn, int kn, String s1, String s2, String s3){
        if(i==in && j==jn && k==kn)return true;
        if(k>=kn)return false;
        if(memo[i][j][k]!=0)
            return memo[i][j][k]==1;
        boolean res=false;
        if(i < in && s1.charAt(i) == s3.charAt(k))
            res=solve(i+1, j, k+1, in, jn, kn, s1, s2, s3);
        if(res ==false && j < jn && s2.charAt(j) == s3.charAt(k))
            res=solve(i, j+1, k+1, in, jn, kn, s1, s2, s3);
        memo[i][j][k] = res==true ? 1 : -1;
        return res;
    }
    
}


class Solution {
    HashMap<String, Boolean> map;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        map=new HashMap<>();
        return solve(0, 0, 0, s1.length(), s2.length(), s3.length(), s1, s2, s3);   
    }
    
    public boolean solve(int i, int j, int k, int in, int jn, int kn, String s1, String s2, String s3){
        if(i==in && j==jn && k==kn)return true;
        if(k>=kn)return false;
        String key="i"+i+"j"+j+"k"+k;
        if(map.containsKey(key))return map.get(key);
        boolean res=false;
        if(i < in && s1.charAt(i) == s3.charAt(k))
            res=solve(i+1, j, k+1, in, jn, kn, s1, s2, s3);
        if(res ==false && j < jn && s2.charAt(j) == s3.charAt(k))
            res=solve(i, j+1, k+1, in, jn, kn, s1, s2, s3);
        map.put(key, res);
        return res;
    }
    
}

class Solution {
    HashMap<String, Boolean> map;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        map=new HashMap<>();
        return solve(0, 0, 0, s1.length(), s2.length(), s3.length(), s1, s2, s3);   
    }
    
    public boolean solve(int i, int j, int k, int in, int jn, int kn, String s1, String s2, String s3){
        if(i==in && j==jn && k==kn)return true;
        if(k>=kn)return false;
        String key="i"+i+"j"+j+"k"+k;
        if(map.containsKey(key))return map.get(key);
        if(i < in && s1.charAt(i) == s3.charAt(k)){
            boolean res1=solve(i+1, j, k+1, in, jn, kn, s1, s2, s3);
            if(res1){
                map.put(key, res1);
                return true;
            }
        }
        if(j < jn && s2.charAt(j) == s3.charAt(k)){
            boolean res2=solve(i, j+1, k+1, in, jn, kn, s1, s2, s3);
            if(res2){
                map.put(key, res2);
                return true;
            }
        }
        map.put(key, false);
        return false;
    }
    
}

//Approach-2 (no need of k for memorization)
class Solution {
    int memo[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1=s1.length(), l2=s2.length(), l3=s3.length();
        if(l1+l2!=l3)return false;
        memo=new int[l1+1][l2+1];
        return solve(0, 0, l1, l2, l3, s1, s2, s3);   
    }
    
    public boolean solve(int i, int j, int in, int jn, int kn, String s1, String s2, String s3){
        if(i==in && j==jn && i+j==kn)return true;
        if(i+j>=kn)return false;
        if(memo[i][j]!=0)
            return memo[i][j]==1;
        boolean res=false;
        if(i < in && s1.charAt(i) == s3.charAt(i+j))
            res=solve(i+1, j, in, jn, kn, s1, s2, s3);
        if(res ==false && j < jn && s2.charAt(j) == s3.charAt(i+j))
            res=solve(i, j+1, in, jn, kn, s1, s2, s3);
        memo[i][j] = res==true ? 1 : -1;
        return res;
    }
    
}

class Solution {
    int m, n, N;
    Boolean dp[][];
    boolean check(String s1, String s2, String s3, int i, int j) {
        if(i >= m && j >= n && i+j >= N) 
            return true;
        
        if(i+j >= N) 
            return false;

        if(dp[i][j] != null)
            return dp[i][j];

        boolean result = false;

        if(i < m && s1.charAt(i) == s3.charAt(i+j)){
            result = check(s1, s2, s3, i+1, j);
        }

        if(result == true){
            return dp[i][j] = result;
        }

        if(j < n && s2.charAt(j) == s3.charAt(i+j)){
            result = check(s1, s2, s3, i, j+1);
        }
        return dp[i][j] = result;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        m = s1.length();
        n = s2.length();
        N = s3.length();

        if(m + n != N)
            return false;

        dp = new Boolean[m+1][n+1];
        return check(s1, s2, s3, 0, 0);

    }
}