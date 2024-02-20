// Approach-1 (Recursion)
// T.C : O(2 ^ n)
// S.C : O(Recursive call stack)
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        return solve(heights, n, 0, bricks, ladders);
    }
    
    public int solve(int[] heights, int n, int idx, int bricks, int ladders){
        if(idx >= n-1){
            return idx;
        }
        
        if(heights[idx] >= heights[idx + 1]){
            return solve(heights, n, idx + 1, bricks, ladders);
        }
        
        int withBricks = idx;
        int withLadders = idx;
        int bricksNeeded = heights[idx + 1] - heights[idx];
        
        if(bricks >= bricksNeeded){
            withBricks = solve(heights, n, idx + 1, bricks - bricksNeeded, ladders);
        }
        
        if(ladders > 0){
            withLadders = solve(heights, n, idx + 1, bricks, ladders - 1);
        }
        
        return Math.max(withBricks, withLadders);
    }
}

// Approach-2
// T.C : 
// S.C : O(n * bricks * ladders)
// Memory limit exceeded
class Solution {
    int[][][] t;
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        t = new int[n + 1][bricks + 1][ladders + 1];
        for(int[][] arr1: t){
            for(int[] arr2: arr1){
                Arrays.fill(arr2, -1);
            }
        }
        return solve(heights, n, 0, bricks, ladders);
    }
    
    public int solve(int[] heights, int n, int idx, int bricks, int ladders){
        if(idx >= n-1){
            return idx;
        }
        
        if(t[idx][bricks][ladders] != -1)
            return t[idx][bricks][ladders];
        
        if(heights[idx] >= heights[idx + 1]){
            return t[idx][bricks][ladders] = solve(heights, n, idx + 1, bricks, ladders);
        }
        
        int withBricks = idx;
        int withLadders = idx;
        int bricksNeeded = heights[idx + 1] - heights[idx];
        
        if(bricks >= bricksNeeded){
            withBricks = solve(heights, n, idx + 1, bricks - bricksNeeded, ladders);
        }
        
        if(ladders > 0){
            withLadders = solve(heights, n, idx + 1, bricks, ladders - 1);
        }
        
        return t[idx][bricks][ladders] = Math.max(withBricks, withLadders);
    }
}
// Approach-3
// T.C : O(n)
// S.C : O(n)
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
