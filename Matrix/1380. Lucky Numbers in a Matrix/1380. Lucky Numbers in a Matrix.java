// Approach-1 (Greedily)
// T.C : O(m * n)
// S.C : O(1)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int minIndex = findMin(matrix, i);
            if(maxInColumn(matrix, i, minIndex)){
                ans.add(matrix[i][minIndex]);
            }
        }
        
        return ans;
    }
    
    public boolean maxInColumn(int[][] matrix, int row, int column){
        int max = matrix[0][column];
        int maxIndex = 0;
        int m = matrix.length;
        
        for(int i = 0; i < m; i++){
            if(matrix[i][column] > max){
                max = matrix[i][column];
                maxIndex = i;
            }
        }
        
        return row == maxIndex;
    }
    
    public int findMin(int [][] matrix, int row){
        int min = matrix[row][0];
        int minIndex = 0;
        int n = matrix[0].length;
        
        for(int j = 0; j < n; j++){
            if(matrix[row][j] < min){
                min = matrix[row][j];
                minIndex = j;
            }    
        }
        
        return minIndex;
    }
}

// Approach-1 (Greedily)
// T.C : O(m * n)
// S.C : O(m + n)
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> rowMin = new ArrayList<>();
        for (int row = 0; row < m; row++) {
            int rMin = Integer.MAX_VALUE;
            for (int col = 0; col < n; col++) {
                rMin = Math.min(rMin, matrix[row][col]);
            }
            rowMin.add(rMin);
        }

        List<Integer> colMax = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            int cMax = Integer.MIN_VALUE;
            for (int row = 0; row < m; row++) {
                cMax = Math.max(cMax, matrix[row][col]);
            }
            colMax.add(cMax);
        }

        List<Integer> result = new ArrayList<>();
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == rowMin.get(row) && matrix[row][col] == colMax.get(col)) {
                    result.add(matrix[row][col]);
                }
            }
        }

        return result;
    }
}