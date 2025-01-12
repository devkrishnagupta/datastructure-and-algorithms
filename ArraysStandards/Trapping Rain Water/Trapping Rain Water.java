// Approach-1 (At each building look at left & right)
// T.C : O(n * n)
// S.C : O(1)

// Approach-2
// S.C : O(n)
// S.C : O(n)

// Approach-3
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int totalWater=0;
        int lmax=0,rmax=0;
        int i=0,j=arr.length-1;
        while(i<j){
            lmax=Math.max(lmax,arr[i]);
            rmax=Math.max(rmax,arr[j]);
            if(arr[i]<=arr[j]){
                totalWater+=lmax-arr[i];
                i++;
            }
            else{
                totalWater+=rmax-arr[j];
                j--;
            }
        }
        return totalWater;
    }
}