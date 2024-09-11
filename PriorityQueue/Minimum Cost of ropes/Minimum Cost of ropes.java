// Approach-1 (Priority Queue)
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(long len: arr){
            queue.add(len);
        }
        
        long cost = 0;
        
        while(queue.size() > 1){
            long first = queue.remove();
            long second = queue.remove();
            long curr = first + second;
            cost += curr;
            queue.add(curr);
        }
        
        return cost;
    }
}