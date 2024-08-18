// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum = 0, firstSum = 0;
        for(int val: arr) sum+=val;
        for(int val: arr){
            sum -= val;
            firstSum += val;
            if(sum == firstSum)
                return true;
        }
        return false;
    }
}