class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int bricksUsed = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                pq.offer(diff);

                if (pq.size() > ladders) {
                    bricksUsed += pq.poll();
                }

                if (bricksUsed > bricks) {
                    return i;
                }
            }
        }

        return n - 1;
    }
}
