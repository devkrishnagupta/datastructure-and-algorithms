// Approach-1 (Brute Force)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int ans = Integer.MIN_VALUE;
        for(int val: a){
            ans = Math.max(ans, val);
        }
        return ans;
    }
}

// Approach-1 (Binary Search)
// T.C : O(logN)
// S.C : O(1)
class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int ans = Integer.MIN_VALUE;
        
        int n = a.size();
        int low = 0, high = n - 1;
        
        while(low < high){
            int mid = low + (high - low) / 2;
            
            if(a.get(mid) > a.get(mid + 1)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        
        return a.get(low);
    }
}