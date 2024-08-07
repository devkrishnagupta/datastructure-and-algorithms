// Approach-1 (Sorting)
// T.C : O(|word|)
// S.C : O(26)  ~   O(1)
class Solution {
    public int minimumPushes(String word) {
        
        int[] freq = new int[26];
        
        for(char ch: word.toCharArray()){
            freq[ch - 'a']++;
        }
        
        // Convert int[] to Integer[] for sorting in reverse order
        Integer[] freqInteger = Arrays.stream(freq).boxed().toArray(Integer[]::new);

        // Sort in reverse order
        Arrays.sort(freqInteger, Collections.reverseOrder());

        // Optional: Convert back to int[]
        freq = Arrays.stream(freqInteger).mapToInt(Integer::intValue).toArray();
        
        int ans = 0;
        
        for(int i = 0; i < freq.length; i++){
            if( i < 8)
                ans += freq[i] * 1;
            else if(i < 16)
                ans += freq[i] * 2;
            else if(i < 24)
                ans += freq[i] * 3;
            else
                ans += freq[i] * 4;
        }
        
        return ans;
    }
}