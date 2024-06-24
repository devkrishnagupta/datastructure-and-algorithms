// Approach-1
// T.C : O(1)
// S.C : O(1)
class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        if(2*n < q){
            return 0l;
        }
        else if(q<=n){
            return q-1;
        }
        else{
            return 2*n-q+1;
        }
    }
}