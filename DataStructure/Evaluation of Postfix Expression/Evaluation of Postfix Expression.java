// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(String str: arr){
            switch(str){
                case "+":
                    int a1 = Integer.valueOf(st.pop());
                    int b1 = Integer.valueOf(st.pop());
                    st.push(a1 + b1);
                    break;
                case "-":
                    int a2 = Integer.valueOf(st.pop());
                    int b2 = Integer.valueOf(st.pop());
                    st.push(b2 - a2);
                    break;
                case "*":
                    int a3 = Integer.valueOf(st.pop());
                    int b3 = Integer.valueOf(st.pop());
                    st.push(a3 * b3);
                    break;
                case "/":
                    int a4 = Integer.valueOf(st.pop());
                    int b4 = Integer.valueOf(st.pop());
                    st.push(b4 / a4);
                    break;
                default:
                    st.push(Integer.valueOf(str));
            }
        }
        
        return st.peek();
    }
}