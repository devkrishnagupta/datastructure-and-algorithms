// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        if(n < 2) return 0;
        
        int maxPrice = prices[n - 1];
        int profit = 0;
        
        for(int i = n - 2; i >= 0; i--){
            if(prices[i] < maxPrice){
                profit = Math.max(profit, maxPrice - prices[i]);
            }else{
                maxPrice = Math.max(maxPrice, prices[i]);
            }
        }
        
        return profit;
    }
}