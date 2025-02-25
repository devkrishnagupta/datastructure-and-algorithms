// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int getMaxArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[n];
        
        // Find the nearest smaller to the left
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                nsl[i] = -1;
            } else if (heights[i] > heights[st.peek()]) {
                nsl[i] = st.peek();
            } else {
                while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    nsl[i] = -1;
                } else {
                    nsl[i] = st.peek();
                }
            }
            st.push(i);
        }

        Stack<Integer> stt = new Stack<>();
        int[] nsr = new int[n];

        // Find the nearest smaller to the right
        for (int i = n - 1; i >= 0; i--) {
            if (stt.isEmpty()) {
                nsr[i] = n;
            } else if (heights[i] > heights[stt.peek()]) {
                nsr[i] = stt.peek();
            } else {
                while (!stt.isEmpty() && heights[i] <= heights[stt.peek()]) {
                    stt.pop();
                }
                if (stt.isEmpty()) {
                    nsr[i] = n;
                } else {
                    nsr[i] = stt.peek();
                }
            }
            stt.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int height = heights[i];
            ans = Math.max(ans, width * height);
        }
        return ans;
    }
}