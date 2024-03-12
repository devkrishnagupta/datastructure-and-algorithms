//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            long a = Long.parseLong(S[0]);
            long b = Long.parseLong(S[1]);
            long c = Long.parseLong(S[2]);
            long n = Long.parseLong(S[3]);
            long m = Long.parseLong(S[4]);

            Solution ob = new Solution();
            System.out.println(ob.genFibNum(a,b,c,n,m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Approach-1 (Brute Force)
// T.C : o(n)
// S.C : O(n)
class Solution {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        // code here
        Map<Long, Long> map = new HashMap<>();
        map.put(1L, 1L);
        map.put(2L, 1L);
        
        for(long i = 3; i <= n; i++){
            Long curr = a * map.get(i - 1) + b * map.get(i - 2) + c;
            map.put(i, curr);
        }
        return map.get(n) % m;
    }
};

// Approach-1
// T.C : o(n)
// S.C : O(1)
class Solution {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        // code here
        if(n == 1L) return 1L;
        if(n == 2L) return 2L;
        
        long ans = 0;
        long n1 = 1;
        long n2 = 1;
        
        for(long i = 3; i <= n; i++){
            ans = a * n1 + b * n2 + c;
            n1 = n2;
            n2 = ans;
        }
        
        return ans % m;
    }
};

// Approach-1 (Matrix Exponentiation)
// T.C : o(logN)
// S.C : O(1)
class Solution {
    static long mat[][], M[][];
    static long m;

    static long genFibNum(long a, long b, long c, long n, long mod) {
        m = mod;
        mat = new long[][]{{a, b, 1}, {1, 0, 0}, {0, 0, 1}};
        M = new long[][]{{a, b, 1}, {1, 0, 0}, {0, 0, 1}};

        if (n <= 2) {
            return 1 % m;
        } else {
            power(mat, n - 2);
            return (mat[0][0] + mat[0][1] + c * mat[0][2]) % m;
        }
    }

    static void multiply(long F[][], long M[][]) {
    
        long result[][] = new long[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += (F[i][k] * M[k][j]) % m;
                    result[i][j] %= m;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                F[i][j] = result[i][j];
            }
        }
    }

    static void power(long F[][], long n) {
        if (n == 0 || n == 1)
            return;

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }
};