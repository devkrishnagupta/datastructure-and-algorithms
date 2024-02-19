// Approach-1 (loop, checking evey time is the in form of power of 2 or not)
// T.C : O(logN)
//S.C : O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1 || n == Integer.MAX_VALUE)
            return false;
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            n /= 2;
        }
        
        return true;
    }
}

// Approach-2(Check numbers of 1's present in the binary form)
// T.C : O(1)
// S.C : O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n != Integer.MIN_VALUE;
    }
}

// Approach-3 (Check all possible numbers of power of 2)
// T.C : O(31)  ~   O(1)
// S.C : O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1 || n == Integer.MAX_VALUE)
            return false;
        int curr = 1;
        for(int i = 1; i <= 31; i++){
            if(curr == n){
                return true;
            }
            curr *= 2;
        }
        
        return false;
    }
}

// Approach-4 (Built in function's)
// T.C : O(logN) //checking every bit from right to left
// S.C : O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1 || n == Integer.MAX_VALUE)
            return false;
       int count = Integer.bitCount(n);
        return count == 1 ? true : false;
    }
}

// Approach-5
// T.C : O(1)
// S.C : O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1 || n == Integer.MAX_VALUE)
            return false;
        return ((int) (Math.pow(2, 30))) % n == 0 ? true : false;
    }
}

// Approach-6
// T.C : O(logN)
// S.C : O(Recursive call stack size)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        
        return n % 2 == 0 && isPowerOfTwo(n/2);
    }
}