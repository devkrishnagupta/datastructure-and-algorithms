// Approach-1 (Brute Force)
// T.C : O(n)
// S.C : O(1)
class Solution {
    long findNth(long n) {
        // code here
        long ans = 1, count = 1;
        while(n != count){
            count++;
            ans++;
            while(digit9Present(ans)){
                ans++;
            }
        }
        
        return ans;
    }
    
    boolean digit9Present(long n){
        while(n > 0){
            if(n % 10 == 9){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    long findNth(long n) {
        // code here
        long ans=0;
        long p=1;
        
        while(n>0){
            ans+=p*(n%9);
            n/=9;
            p*=10;
        }
        return ans;
    }
}