// T.C : O(n * m)
// S.C : O(n + m)
// Brute Force
class Solution {
    public int median(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n * m];
        
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int col = 0; col < m; col++){
                arr[index++] = mat[i][col];
            }
        }
        
        Arrays.sort(arr);
        
        int idx = (n * m)/2;
        return arr[idx];
    }
}

// T.C : O()
// S.C : O()
// Binary Search
class Solution {
    public int median(int[][] matrix) {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Finding the minimum and maximum element in the matrix
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int desired = (n * m + 1) / 2;

        while (low < high) {
            int mid = (low + high) / 2;

            // Count how many numbers are less than or equal to mid
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += countLessThanOrEqual(matrix[i], mid);
            }

            if (count < desired) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    
    // Binary search to find number of elements <= target in a row
    private static int countLessThanOrEqual(int[] row, int target) {
        int l = 0, r = row.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (row[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}