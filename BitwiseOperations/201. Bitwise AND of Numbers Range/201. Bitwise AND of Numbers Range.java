// Approach-1 (Brute Forec)
// T.C : O(n)
// S.C : O(1)
// T.T.L
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int result = 0;
        
        for(int num = left; num <= right; num++){
            result &= num;    
        }
            
        return result;
    }
}

// Approach-2 (Using right shift make them equals of first and last element, Then left shift up to padding zero ~ Longest common prefix)
// T.C : O(logN)
// S.C : o(1)
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;
        
        while(left != right){
            
            left = (left >> 1);
            right = (right >> 1);
            shiftCount++;
        }
        
        return left << shiftCount;
    }
}

// Approach-3 ( N & (N-1) ~ clears the right most set bit)
// T.C : O(logN)
// S.C : O(1)
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        while(right > left){
            
            right = ( right & (right -1)); // n & (n -1)
        }
        
        return right;
    }
}