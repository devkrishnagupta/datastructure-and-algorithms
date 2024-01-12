class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count = 0;
        int n = s.length();
        int half = n/2;
        int idx = 0;
        while(idx < half){
            if(vowels.contains(s.charAt(idx)))
               count++;
            idx++;
        }
        while(half < n){
            if(vowels.contains(s.charAt(half)))
                count--;
            half++;
        }
        return count == 0;
    }
}

class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count = 0;
        int n = s.length();
        int half = n/2;
        for(int i = 0; i < half; i++){
            if(vowels.contains(s.charAt(i)))
                count++;
            if(vowels.contains(s.charAt(i+half)))
                count--;
        }
        return count == 0;
    }
}