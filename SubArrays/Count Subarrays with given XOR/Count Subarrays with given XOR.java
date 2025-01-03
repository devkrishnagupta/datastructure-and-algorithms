// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int xor_=0,ans=0;
        HashMap<Integer,Integer> mm = new HashMap<>();
        for(int x:arr){
            xor_^=x;
            if(xor_==k)ans++;
            ans+=mm.getOrDefault(xor_^k,0);
            mm.put(xor_,mm.getOrDefault(xor_,0)+1);
        }
        return ans;
    }
}