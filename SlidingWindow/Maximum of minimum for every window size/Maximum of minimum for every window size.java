// Approach-1 (TLE)
// T.C : O()
// S.C : O()
class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
            int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));

        // Consider all windows of different 
        // sizes starting from size 1
        for (int k = 1; k <= n; k++) {

            // Initialize max of min for current window size k
            int maxOfMin = Integer.MIN_VALUE;

            // Traverse through all windows of current size k
            for (int i = 0; i <= n - k; i++) {

                // Find minimum of current window
                int minVal = arr[i];
                for (int j = 1; j < k; j++) {
                    if (arr[i + j] < minVal)
                        minVal = arr[i + j];
                }

                // Update maxOfMin if required
                if (minVal > maxOfMin)
                    maxOfMin = minVal;
            }

            // Store max of min for current window size
            res.set(k - 1, maxOfMin);
        }

        return res;
    }
}

