// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(dq.size()!=0 && dq.getFirst()==i-k)dq.removeFirst();
            while(dq.size()!=0 && arr[dq.getLast()]<=arr[i])dq.removeLast();
            dq.add(i);
            if(i>=k-1)ans.add(arr[dq.getFirst()]);
        }
        return ans;
    }
}

// Approach-2
// T.C : O()
// S.C : O()
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
    for (int i = 0; i < arr.length; i++) {
        while (!deque.isEmpty() && deque.peek() < i - k + 1) {
            deque.poll();
        }
        while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
            deque.pollLast();
        }
        deque.offer(i);
        if (i >= k - 1) {
            result.add(arr[deque.peek()]);
        }
    }
    return result;
    }
}