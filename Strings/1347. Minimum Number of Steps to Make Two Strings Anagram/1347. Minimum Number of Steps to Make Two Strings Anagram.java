//Approach-1
//Time N
//Space 1
class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        
        int[] mp_s = new int[26];
        int[] mp_t = new int[26];
        
        for(int i = 0; i < n; i++){
            mp_s[s.charAt(i) - 'a']++;
            mp_t[t.charAt(i) - 'a']++;
        }
        
        int result = 0;
        
        for(int i = 0; i < 26; i++){
            if(mp_s[i] > mp_t[i]){
                result += mp_s[i] - mp_t[i];
            }
        }
        
        return result;
    }
}

//Approach-2 (Optimization of first)
//Time N
//Space 1
class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        
        int[] mp_s = new int[26];
        
        for(int i = 0; i < n; i++){
            mp_s[s.charAt(i) - 'a']++;
            mp_s[t.charAt(i) - 'a']--;
        }
        
        int result = 0;
        
        for(int i = 0; i < 26; i++){
            if(mp_s[i] > 0){
                result += mp_s[i];
            }
        }
        
        return result;
    }
}