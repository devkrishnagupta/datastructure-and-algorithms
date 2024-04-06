// Approach-1
// T.C : o(n)
// S.C : o(n)
class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        
        Stack<Integer> st_i = new Stack<>();
        Stack<Character> st_c = new Stack<>();
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == ')' && st_c.size() > 0 && st_c.peek() == '('){
                st_i.pop();
                st_c.pop();
            }else if(ch == ')' || ch == '('){
                st_i.push(i);
                st_c.push(ch);
            }
        }
        
        st_i.sort(Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            if(st_i.size() > 0 && st_i.peek() == i){
                st_i.pop();
            }else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}