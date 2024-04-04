// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        
        int n = s.length();
        
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.add(ch);
            }else if(ch == ')'){
                st.pop();
            }
            ans = Math.max(ans, st.size());
        }
        
        return ans;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        
        int ans = 0;
        int openBrackets = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openBrackets++;
            }else if(ch == ')'){
                openBrackets--;
            }
            ans = Math.max(ans, openBrackets);
        }
        
        return ans;
    }
}