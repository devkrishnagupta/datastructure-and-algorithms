//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Approach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    String printLargest(int n, String[] arr) {
        // code here
       String[] result  = Arrays.stream(arr).sorted((s1, s2) -> {
            int n1 = 0;
            int n2 = 0;
            while(n1 < s1.length() || n2 < s2.length()){
                if(n1 == s1.length()){
                    n1 = 0;
                }
                if(n2 == s2.length()){
                    n2 = 0;
                }
                if(s1.charAt(n1) > s2.charAt(n2)){
                    return -1;
                }else if(s1.charAt(n1) < s2.charAt(n2)){
                    return 1;
                }
                n1++;
                n2++;
            }
            return Integer.compare(s2.length(), s1.length());
        }).toArray(String[]::new);

        String ans = String.join("", result);
        
        return ans;
    }
}

// Approach-2
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        String[] result  = Arrays.stream(arr).sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2)).toArray(String[]::new);

        String ans = String.join("", result);
        
        return ans;
    }
}