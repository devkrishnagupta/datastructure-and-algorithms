//Approach-1 (Using BINARY SEARCH)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m = matrix[0].length;
        int l=0, h = (n*m)-1;
        while(l <= h){
            int mid = ( l + (h-l)/2 );
            if( matrix[mid/m][mid%m] == target )
                return true;
            else if(matrix[mid/m][mid%m] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return false;   
    }
}

//Approach-2 (Using BINARY SEARCH TREE)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0, column=n-1;
        while(row<m && column>=0){
            if(matrix[row][column]==target)return true;
            if(matrix[row][column]<target)row++;
            else column--;
        }
        return false;
    }
}