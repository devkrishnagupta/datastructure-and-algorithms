// Approach-1 (Brute Force)
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // Create a stack to hold the opening brackets
        Stack<Character> st = new Stack<>();

        // Iterate through each character in the string
        for (char ch : x.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    st.push(ch); // Add opening brackets to the stack
                    break;

                case '}':
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop(); // Remove matching opening bracket
                    } else {
                        return false; // Unmatched closing bracket
                    }
                    break;

                case ')':
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop(); // Remove matching opening bracket
                    } else {
                        return false; // Unmatched closing bracket
                    }
                    break;

                case ']':
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop(); // Remove matching opening bracket
                    } else {
                        return false; // Unmatched closing bracket
                    }
                    break;
            }
        }

        // If the stack is empty, all brackets are balanced
        return st.isEmpty();
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == ')'){
                if(st.isEmpty() || st.peek() != '(') return false;
                st.pop();
            }else if(ch == '}'){
                if(st.isEmpty() || st.peek() != '{') return false;
                st.pop();
            }else if(ch == ']'){
                if(st.isEmpty() || st.peek() != '[') return false;
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}