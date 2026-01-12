// Approach-1 (Using PriorityQueue)
// T.C : O(n * k)
// S.C : O(k)
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k - 1; i++){
            pq.add(arr[i]);
        }
        
        for(int i = k - 1; i < arr.length; i++){
            pq.add(arr[i]);
            ans.add(pq.peek());
            pq.remove(arr[i - k + 1]);
        }
        
        return ans;
    }
}

// Approach-2 (Using Dequeue)
// T.C : O(n)
// S.C : O(k)
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current element index
            dq.offerLast(i);

            // Add max for current window
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }

        return ans;
    }
}
