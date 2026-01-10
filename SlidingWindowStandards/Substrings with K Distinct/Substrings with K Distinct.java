// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int countSubstr(String s, int k) {
        if (k == 0) return 0;
        return atMostK(s, k) - atMostK(s, k - 1);
    }
    
    private int atMostK(String s, int k) {
        int[] freq = new int[26];
        int left = 0, count = 0, distinct = 0;
        
        for (int right = 0; right < s.length(); right++) {
            int rChar = s.charAt(right) - 'a';
            if (freq[rChar] == 0) distinct++;
            freq[rChar]++;
            
            while (distinct > k) {
                int lChar = s.charAt(left) - 'a';
                freq[lChar]--;
                if (freq[lChar] == 0) distinct--;
                left++;
            }
            
            count += right - left + 1;
        }
        
        return count;
    }
}
