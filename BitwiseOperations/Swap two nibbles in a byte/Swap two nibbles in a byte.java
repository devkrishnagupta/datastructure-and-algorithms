// Approach-1
// T.C : O(1)
// S.C : O(1)
class Solution {
    static int swapNibbles(int n) {
        // code here
        
        return (n & 0x0F)  << 4 | n >> 4;
    }
}