//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


// Approach-1 (Brute Force)
// T.C : O(n * n * logN)
// S.C : O(1)
class Solution {
    long sumBitDifferences(int[] arr, int n) {
        // code here
        long count = 0;
        
        for(int  i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    count += setBits((arr[i] ^ arr[j]));
                }
            }
        }
        
        return count;
    }
    
    int setBits(int n){
        int count = 0;
        
        while(n > 0){
            count += (n & 1);
            n >>= 1;
        }
        
        return count;
    }
}

// Approach-1 (Hamming Distance) + (Bit optimized as we the pair count for reverse order, so simply double it)
// T.C : O(n * n * logN)
// S.C : O(1)
class Solution {
    long sumBitDifferences(int[] arr, int n) {
        // code here
        long count = 0;
        
        for(int  i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(i != j){
                    count += hammingDistance(arr[i], arr[j]) * 2;
                }
            }
        }
        
        return count;
    }
    
    int hammingDistance(int x, int y){
        int ans = 0;
        
        while(x > 0 || y > 0){
            if((x & 1) != (y & 1))
                ans++;
            x /= 2;
            y /= 2;
        }
        
        return ans;
    }
}

// Approach-3
// T.C: O(n)
// S.C : O(1)
class Solution {
    long sumBitDifferences(int[] arr, int n) {
        // code here
        long ans = 0;
        
        for(int  i = 0; i < 32; i++){
            long cnt = 0;    // with I'th bit set
            for(int j = 0; j < n; j++){
                if((arr[j] & (1 << i)) != 0)    // check with I'th bit is set
                    cnt++;
            }
            
            // all permuatations
            ans += (cnt * (n - cnt) * 2);
        }
        
        return ans;
    }
}