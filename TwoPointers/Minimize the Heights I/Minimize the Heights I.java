// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int getMinDiff(int k, int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1] - arr[0];
        
        for(int i=1;i<n;i++){
            //0 to i-1 value inc.
            //i to n-1 value dec.
            
            //before dec check if it is still stays +ve
            
            int min = Math.min(arr[0]+k, arr[i]-k);
            int max = Math.max(arr[i-1]+k, arr[n-1]-k);
            
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}