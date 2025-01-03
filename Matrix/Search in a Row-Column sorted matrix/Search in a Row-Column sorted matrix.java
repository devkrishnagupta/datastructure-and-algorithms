// Approach-1
// T.C : O(n + m)
// S.C : O(1)
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
        
        int i = 0;
        int j = m - 1;
        
        while(i < n && j >= 0){
            if(mat[i][j] == x){
                return true;
            }else if(mat[i][j] > x){
                j--;
            }else{
                i++;
            }
        }       
        return false;
    }
}