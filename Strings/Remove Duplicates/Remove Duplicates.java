// Approach-1
// T.C : O( 2 * n)  ~   O(n)
// S.C : O(1)
class Solution {
    String removeDups(String str) {
        // code here
        int[] freq = new int[26];
        for(char ch: str.toCharArray()){
            freq[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if(freq[ch - 'a'] != 0){
                sb.append(ch);
                freq[ch - 'a'] = 0;
            }   
        }
        
        return sb.toString();
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    String removeDups(String str) {
        // code here
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if(freq[ch - 'a'] == 0){
                freq[ch - 'a'] = 1;
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}