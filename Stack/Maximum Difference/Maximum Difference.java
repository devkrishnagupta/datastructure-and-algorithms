// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i > 0; i--){
            if(arr[i - 1] < arr[i]){
                ls[i] = arr[i - 1];
                while(!st.isEmpty() && arr[st.peek()] > arr[i - 1]){
                    int idx = st.pop();
                    ls[idx] = arr[i - 1];
                }
            }else{
                st.push(i);
            }
        }
        
        for(int i = 0; i < n - 1; i++){
            if(arr[i + 1] < arr[i]){
                rs[i] = arr[i + 1];
                while(!st.isEmpty() && arr[st.peek()] > arr[i + 1]){
                    int idx = st.pop();
                    rs[idx] = arr[i + 1];
                }
            }else{
                st.push(i);
            }
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, Math.abs(ls[i] - rs[i]));
        }
        
        return ans;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int findMaxDiff(int[] arr) {
        int n = arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        // Find the nearest smaller element on the left for each element
        for (int i = 0; i < n; i++) {
            while (!leftStack.isEmpty() && leftStack.peek() >= arr[i]) {
                leftStack.pop();
            }
            ls[i] = leftStack.isEmpty() ? 0 : leftStack.peek();
            leftStack.push(arr[i]);
        }

        // Find the nearest smaller element on the right for each element
        for (int i = n - 1; i >= 0; i--) {
            while (!rightStack.isEmpty() && rightStack.peek() >= arr[i]) {
                rightStack.pop();
            }
            rs[i] = rightStack.isEmpty() ? 0 : rightStack.peek();
            rightStack.push(arr[i]);
        }

        int maxDiff = 0;
        // Calculate the maximum absolute difference
        for (int i = 0; i < n; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(ls[i] - rs[i]));
        }

        return maxDiff;
    }
}