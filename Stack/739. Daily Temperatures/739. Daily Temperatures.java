// Approach-1 Brute Force
// T.C : O(n * n)
// S.C : O(1)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        
        int[] waits = new int[n];
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(temperatures[j] > temperatures[i]){
                    waits[i] = j - i;
                    break;
                }
            }
        }
        
        return waits;
    }
}

//General Questions (Monotonic Stack ~ either increasing order stack or decreasing order stack)
// Next Greater element
// Next Smaller element
// Previous Greater elemnt
// Previous Smaller element

// Approach-2 (Using Stack) Next greater element in array on right side
// T.C : O(2 * n) ~ O(n) ~ every element pushed to stack at only one time
// S.C : O(1)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        
        int[] waits = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                waits[i] = 0;
            }else{
                waits[i] = st.peek() - i;
            }
                
            st.push(i);
        }
        
        return waits;
    }
}