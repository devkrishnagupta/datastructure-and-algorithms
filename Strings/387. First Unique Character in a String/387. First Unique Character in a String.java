// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
    
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
            
        }
        
        return -1;
    }
}

// APproach-2
// T.C : O(n)
// S.C : O(26)  ~   O(1)
class Solution {
    
    public int firstUniqChar(String s) {
        
        int[] freq = new int[26];
    
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1){
                return i;
            }
        }
        
        return -1;
    }
}

// Approach-3
// T.C : O(26 * 2 * n)  ~   O(n)
// S.C : O(1)
class Solution {
    
    public int firstUniqChar(String s) {
        
        int ans = Integer.MAX_VALUE;
    
        for(char c = 'a'; c <= 'z'; c++){
            int left = s.indexOf(c);
            if(left != -1 && left == s.lastIndexOf(c)){
                ans = Math.min(ans, left);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}