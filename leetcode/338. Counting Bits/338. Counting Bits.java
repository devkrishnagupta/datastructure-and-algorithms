class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0,num=i;
            while(num>0){
                int lsb=num & ~(num-1);
                num^=lsb;
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}