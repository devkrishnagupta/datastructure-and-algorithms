//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Approach-1 (Using storing the the chars)
// T.C : O(n)
// S.C : O(n)
class Solution {
    String removeDuplicates(String str) {
        
        Set<Character> chars = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if(chars.add(ch))
                sb.append(ch);
        }
        
        return sb.toString();
    }
}

// Approach-2 (Using the usages of ranges of chars up to 65 -> 90 & 97 -> 122)
// T.C : O(n)
// S.C : O(123) ~   O(1)
class Solution {
    String removeDuplicates(String str) {
        
        boolean[] present = new boolean[123];
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if(!present[ch]){
                sb.append(ch);
                present[ch] = true;
            }
        }
        
        return sb.toString();
    }
}