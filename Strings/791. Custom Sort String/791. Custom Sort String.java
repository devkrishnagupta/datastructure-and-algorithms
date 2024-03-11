// Approach-1 (Brute Force)
// T.C : O(|order| + |s|)
// T.C : O(|s|)
class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Long> freq = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++){
            char ch = order.charAt(i);
            if(freq.containsKey(ch)){
                long count =  freq.get(ch);
                for(int j = 0; j < count; j++){
                    sb.append(ch);
                }
                freq.remove(ch);
            }
        }
        
        for(char key: freq.keySet()){
            long count = freq.get(key);
            for(int j = 0; j < count; j++){
                sb.append(key);
            }
        }
            
        return sb.toString();
    }
}

// Approach-1 (Brute Force optimized)
// T.C : O(|order| + |s|)
// T.C : O(26)  ~   O(1)
class Solution {
    public String customSortString(String order, String s) {
        
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++){
            int ch = order.charAt(i) - 'a';
            if(freq[ch] > 0){
                for(int j = 0; j < freq[ch]; j++){
                    sb.append((char)(ch + 'a'));
                }
                freq[ch] = 0;
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                continue;
            }
            for(int j = 0; j < freq[i]; j++){
                sb.append((char)(i+ 'a'));
            }
        }
            
        return sb.toString();
    }
}

// Approach-3 (Using Custom comparator with Lambda Expression)
// T.C : O(|s|)
// S.C : O()
class Solution {
    public String customSortString(String order, String s) {
       int[] freq = new int[26];

        Arrays.fill(freq, 26);

        for (int i = 0; i < order.length(); i++) {
            freq[order.charAt(i) - 'a'] = i;
            System.out.println(order.charAt(i));
        }

        String ans = s.chars().mapToObj(ch -> (char) ch).sorted((ch1, ch2) -> {
            return Integer.compare(freq[ch1 - 'a'], freq[ch2 - 'a']);
        }).map(Object::toString).collect(Collectors.joining());
        
        return ans;
    }
}