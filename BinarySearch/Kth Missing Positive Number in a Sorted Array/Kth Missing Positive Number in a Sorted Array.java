// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int hi=n-1, lo=0, res=k+n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>mid+k){
                res=mid+k;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
}