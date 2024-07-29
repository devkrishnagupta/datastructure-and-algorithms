// Approach-1 (Brute Force)
// T.C : O(row * col)
// S.C : O(1)

// Approach-1 (Binary Search From Left)
// T.C : O(row * log(COL))
// S.C : O(1)

// Approach-1 (Brute Force)
// T.C : O(m * n)
// S.C : O(1)

// Approach-1 (Optimized)
// T.C : O(m * n)
// S.C : O(1)
class Solution {

    public int rowWithMax1s(int arr[][]) {

        int ans = -1;

        int max = 0;

        int row = arr.length;

        int col = arr[0].length;

        for(int r = 0; r < row; r++){

            int count = 0;

            for(int c = col - 1; c >= 0; c--){

                if(arr[r][c] == 1){

                    count++;

                }else{

                    break;
                }
            }

            if(count > max){

                max = count;

                ans = r;

            }
        }

        return ans;

    }

}

// Approach-1 (Optimal)
// T.C : O(m + n)
// S.C : O(1)
class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        
        int ans = -1;
        int max = 0;
        int row = arr.length;
        int col = arr[0].length;
        
        int c = col - 1;
        for(int r = 0; r < row; r++){
            int count = 0;
            for(; c >= 0; c--){
                if(arr[r][c] == 1){
                    count = col - c + 1;
                }else{
                    break;
                }
            }
            if(count > max){
                max = count;
                ans = r;
            }
        }
        
        return ans;
    }
}