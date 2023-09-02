//Approach-1
//Time = n * log(n)
//Space 1
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

//Approach-2
//Tiem n
//Space 1
class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                ans[i]=ans[i/2];
            else
                ans[i]=ans[i/2]+1;
        }
        return ans;
    }
}