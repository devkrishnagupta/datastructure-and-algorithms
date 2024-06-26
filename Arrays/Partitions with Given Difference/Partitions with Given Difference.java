// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    static int mod=1000000007;
    static int help(int n,int d,int[] arr,int sum,int temp,int index,int dp[][]){
        if(sum-temp-temp<d)return 0;
        if(index==n){
            int secondSum=sum-temp;
            if(secondSum-temp==d)return 1;
            return 0;
        }
        if(dp[index][temp]!=-1)return dp[index][temp];
        int a = help(n,d,arr,sum,temp,index+1,dp);
        int b = help(n,d,arr,sum,temp+arr[index],index+1,dp);
        return dp[index][temp] = (a+b)%mod;
    }
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++)sum+=arr[i];
        int dp[][] = new int[n][sum+1];
        for(int x[]:dp)Arrays.fill(x,-1);
        return help(n,d,arr,sum,0,0,dp);
    }
}