// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int mod = 1000000007;
        int xr = 0;
        int n = arr.length;
        for(int val: arr){
            xr ^= val;
        }
        
        if(xr != 0) return 0;
        
        int pow = (int) Math.pow(2, n - 1);
        
        return (pow - 1) % mod;
    }
}