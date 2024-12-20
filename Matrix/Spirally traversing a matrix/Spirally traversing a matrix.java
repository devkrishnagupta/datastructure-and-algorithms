// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        int n=matrix.length,m=matrix[0].length,s=n*m;
        ArrayList<Integer> ans = new ArrayList<>();
        // a -> row start, b -> col start, c-> row end, d-> col end
        int a=0,b=0,c=n-1,d=m-1;
        while(ans.size()<s){
            for(int i=b;i<=d && ans.size()<s;i++)ans.add(matrix[a][i]);
            a++;
            for(int i=a;i<=c && ans.size()<s;i++)ans.add(matrix[i][d]);
            d--;
            for(int i=d;i>=b && ans.size()<s;i--)ans.add(matrix[c][i]);
            c--;
            for(int i=c;i>=a && ans.size()<s;i--)ans.add(matrix[i][b]);
            b++;
        }
        return ans;
    }
}

// Approach-2
// T.C : O()
// S.C : O()
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // Create an ArrayList to store the result
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Initialize the boundaries for traversal
        int top = 0, left = 0, bottom = mat.length - 1, right = mat[0].length - 1;
        
        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            if (top > bottom) break;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            if (left > right) break;

            // Traverse from right to left along the bottom row
            for (int i = right; i >= left; i--) {
                ans.add(mat[bottom][i]);
            }
            bottom--;
            if (top > bottom) break;

            // Traverse from bottom to top along the left column
            for (int i = bottom; i >= top; i--) {
                ans.add(mat[i][left]);
            }
            left++;
        }
        
        // Return the result
        return ans;
    }
}