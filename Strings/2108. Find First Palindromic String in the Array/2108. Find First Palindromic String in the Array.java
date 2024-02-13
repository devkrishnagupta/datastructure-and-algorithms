import java.util.Optional;
class Solution {
    public String firstPalindrome(String[] words) {
        Optional<String> firstPalindromicStr = Arrays.stream(words)
            .filter(this::isPalindrome)
            .findFirst();
        return firstPalindromicStr.isPresent() ? firstPalindromicStr.get() : "";
    }
    
    public boolean isPalindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}