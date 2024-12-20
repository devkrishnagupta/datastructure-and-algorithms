// Approach-1 (KMP Algorithm)
// T.C : O(N)
// S.C : O(N)
class Solution {
    public static int minChar(String s) {
        // Write your code here
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        StringBuilder com = new StringBuilder();
        com.append(s).append('$').append(rev.toString());
        String complete = com.toString();
        int n = complete.length(),i = 0, j = 1;
        int lps[] = new int[n];
        Arrays.fill(lps,0);
        while(j<n){
            if(complete.charAt(j) == complete.charAt(i))lps[j++] = ++i;
            else if(i!=0)i=lps[i-1];
            else j++;
        }
        return s.length()-i;
    }
}