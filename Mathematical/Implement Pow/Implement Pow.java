// Approach-1
// T.C : O(logN)
// S.C : O(logN)
class Solution {
    double power(double b, int e) {
        // code here
        if(e == 0) return 1;
        if(e == 1) return b;
        if(e < 0) return 1/power(b, -1 * e);
        double res = power(b, e/2);
        if(e % 2 == 0) return res * res;
        return res * res * b;
    }
}