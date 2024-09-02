// Approach-1 (Dijkstras)
// T.C : O( n * n * logN)
// S.C : O(n * n)
class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
	
	class Cell {
        int x, y, cost;
        
        Cell(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] dist = new int[n][n];
        
        // Initialize distances with a high value (effectively infinity)
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Use a priority queue to select the minimum cost path at each step
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        
        // Start from the top-left corner
        dist[0][0] = grid[0][0];
        pq.add(new Cell(0, 0, grid[0][0]));
        
        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            int x = current.x;
            int y = current.y;
            int currentCost = current.cost;
            
            // If we reached the bottom-right corner, return the cost
            if (x == n - 1 && y == n - 1) {
                return currentCost;
            }
            
            // Explore the 4 possible directions
            for (int[] dir : dirs) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];
                
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                    int newCost = currentCost + grid[nextX][nextY];
                    
                    // If the new calculated cost is less than the known cost, update it
                    if (newCost < dist[nextX][nextY]) {
                        dist[nextX][nextY] = newCost;
                        pq.add(new Cell(nextX, nextY, newCost));
                    }
                }
            }
        }
        
        return dist[n - 1][n - 1]; // Return the minimum cost to reach the bottom-right corner
    }
}

// Approach-2
// T.C : O()
// S.C : O()