// Approach-1 (Using PriorityQueue)
// T.C : O(n + k)
// S.C : O(n)
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int val: arr){
            pq.add(val);
        }
        int ans = 0;
        while(k > 0){
            ans = pq.poll();
            k--;
        }
        
        return ans;
    }
}

// Approach-1 (Using Max Heap)
// T.C : O(n + k)
// S.C : O(n)