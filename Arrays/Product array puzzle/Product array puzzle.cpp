// Approach-1
// T.C : O()
// S.C : O()
class Solution {
  public:
    vector<int> productExceptSelf(vector<int>& arr) {
        long long prod=1;
        int zero=0;
        vector<int> ans;
        for(auto num:arr){
             if(num!=0) prod=prod*num;
             else zero++;
        }
        for(auto num:arr){
            if(zero>1) ans.push_back(0);
            else if(num!=0){
                if(zero>0) ans.push_back(0);
                else ans.push_back(prod/num);
            }
            else ans.push_back(prod);
        }
        return ans;
    }
};