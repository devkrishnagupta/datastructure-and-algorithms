// Approach-1
// T.C : O(|str|)
// S.C : O(|str|)
class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] arr = str.split("\\.");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            ans.append(arr[i]);
            if(i != 0){
                ans.append(".");
            }
        }
        return ans.toString();
    }
}