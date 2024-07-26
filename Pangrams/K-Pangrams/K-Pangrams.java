// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        int ch_cnt = 0;
        int[] freq = new int[26];
        
        for(char ch: str.toCharArray()){
            if(ch == ' ')
                continue;
            freq[ch - 'a']++;
            ch_cnt++;
        }
        
        if(ch_cnt < 26)
            return false;
        
        int cnt = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                cnt++;
            }
        }
        
        return cnt <= k;
    }
}