// Approach-1 (Using Heap)
// T.C : O(n) + n(n*logN)   ~   O(n * logN) as Create Heap Takes logN Time
// S.C : O(n)
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            pq.offer(num);
        }
        
        long score = 0;
        while(k-- > 0 && !pq.isEmpty()){
            int num = pq.poll();
            score += num;
            pq.offer((num + 2) / 3); // +2 will handled the ceiling of 3
        }
        return score;
    }
}