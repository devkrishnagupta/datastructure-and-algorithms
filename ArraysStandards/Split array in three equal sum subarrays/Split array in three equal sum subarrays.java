// Approach-1
// T.C : O()
// S.C : O()
class Solution {

    public List<Integer> findSplit(int[] arr) {
         // code here
         int n = arr.length,sum=0;
         List<Integer> ans = new ArrayList<>();
         for(int x:arr)sum+=x;
         if(sum%3!=0){
             ans.add(-1);
             ans.add(-1);
             return ans;
         }
         int requiredSum=sum/3;
         sum=0;
         for(int i=0;i<n;i++){
             sum+=arr[i];
             if(sum==requiredSum){
                 ans.add(i);
                 if(ans.size()==2)break;
                 sum=0;
             }
         }
         if(ans.size()==2)return ans;
         ans.clear();
         ans.add(-1);
         ans.add(-1);
         return ans;
     }
 }