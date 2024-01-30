// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        
        for(String str : tokens){
            switch(str){
                case "+":
                    int a1 = st.pop();
                    int b1 = st.pop();
                    st.push(b1 + a1);
                    break;
                case "-":
                    int a2 = st.pop();
                    int b2 = st.pop();
                    st.push(b2 - a2);
                    break;
                case "*":
                    int a3 = st.pop();
                    int b3 = st.pop();
                    st.push(b3 * a3);
                    break;
                case "/":
                    int a4 = st.pop();
                    int b4 = st.pop();
                    st.push(b4 / a4);
                    break;
                default :
                    st.push(Integer.valueOf(str));
                    break;
            }
        }
        
        return st.pop();
    }
}

// Approach-2
//
//
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        BinaryOperator<Integer> add = (a, b) -> b + a;
        BinaryOperator<Integer> sub = (a, b) -> b - a;
        BinaryOperator<Integer> mul = (a, b) -> b * a;
        BinaryOperator<Integer> div = (a, b) -> b / a;
        
        for(String str : tokens){
            switch(str){
                case "+":
                    st.push(add.apply(st.pop(), st.pop()));
                    break;
                case "-":
                    st.push(sub.apply(st.pop(), st.pop()));
                    break;
                case "*":
                    st.push(mul.apply(st.pop(), st.pop()));
                    break;
                case "/":
                    st.push(div.apply(st.pop(), st.pop()));
                    break;
                default :
                    st.push(Integer.valueOf(str));
                    break;
            }
        }
        
        return st.pop();
    }
}

// Approach-3
//
//
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        BiFunction<Integer, Integer, Integer> add = (a, b) -> b + a;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> b - a;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> b * a;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> b / a;
        
        for(String str : tokens){
            switch(str){
                case "+":
                    st.push(add.apply(st.pop(), st.pop()));
                    break;
                case "-":
                    st.push(sub.apply(st.pop(), st.pop()));
                    break;
                case "*":
                    st.push(mul.apply(st.pop(), st.pop()));
                    break;
                case "/":
                    st.push(div.apply(st.pop(), st.pop()));
                    break;
                default :
                    st.push(Integer.valueOf(str));
                    break;
            }
        }
        
        return st.pop();
    }
}

// Approach-4
//
//
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        
        Map<String, BinaryOperator<Integer>> map = Map.of(
            "+", (a, b) -> b + a,
            "-", (a, b) -> b - a,
            "*", (a, b) -> b * a,
            "/", (a, b) -> b / a
        );
        
        for(String token : tokens){
            if(map.containsKey(token)){
                st.push(map.get(token).apply(st.pop(), st.pop()));
            }else{
                st.push(Integer.valueOf(token));
            }
        }
        
        return st.pop();
    }
}

//Approach-5
//
//
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        
        Map<String, BiFunction<Integer, Integer, Integer>> map = Map.of(
            "+", (a, b) -> b + a,
            "-", (a, b) -> b - a,
            "*", (a, b) -> b * a,
            "/", (a, b) -> b / a
        );
        
        for(String token : tokens){
            if(map.containsKey(token)){
                st.push(map.get(token).apply(st.pop(), st.pop()));
            }else{
                st.push(Integer.valueOf(token));
            }
        }
        
        return st.pop();
    }
}