// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int myAtoi(String s) {
        // Initialize variables
        int i = 0, sign = 1;
        long ans = 0;
        
        // Trim leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // Convert digits to number
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + (s.charAt(i) - '0');
            
            // Handle overflow
            if (sign * ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        
        // Return the result with the sign
        return (int) (sign * ans);
    }
}