// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int ans=0,n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                ans+=prices[i]-prices[i-1];
            }
        }
        return ans;
    }
}