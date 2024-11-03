// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)
class Solution {
    public boolean rotateString(String s, String goal) {
        int n1 = s.length();
        int n2 = goal.length();
        if(n1 != n2) return false;
        
        for(int i = 0; i < n2; i++){
            int match = 0;
            for(int j = 0; j < n1; j++){
                if(s.charAt((i + j) % n1) != goal.charAt(j)){
                    break;
                }
                match++;
            }
            if(match == n1) return true;
        }
        
        return false;
    }
}

// Approach-1 (Contains Method)
// T.C : O(|str| * |Sub String|)
// S.C : O(1)
class Solution {
    public boolean rotateString(String s, String goal) {
        int n1 = s.length();
        int n2 = goal.length();
        if(n1 != n2) return false;
        
        s += s;
        
        return s.contains(goal);
    }
}

// Aproach-1 (KMP (Knuth-Morris-Pratt))
// T.C : O()
// T.C : O()
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) return false;
        
        // Concatenate s with itself
        String doubledS = s + s;

        // KMP search for goal in doubledS
        return kmpSearch(doubledS, goal);
    }

    private boolean kmpSearch(String text, String pattern) {
        int[] lps = buildLPS(pattern);
        int n = text.length();
        int m = pattern.length();
        
        int i = 0; // index for text
        int j = 0; // index for pattern
        
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                return true; // Found pattern
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use the LPS array
                } else {
                    i++;
                }
            }
        }
        return false; // Pattern not found
    }

    private int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Use the LPS array
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
