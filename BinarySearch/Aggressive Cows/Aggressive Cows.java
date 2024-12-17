// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    static boolean isPossible(int stalls[],int k,int mid,int n){
        int c=1,prev=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-prev>=mid){
                c++;
                prev=stalls[i];
            }
        }
        return c>=k;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length,low=0,high=stalls[n-1]-stalls[0],mid,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(stalls,k,mid,n)){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}