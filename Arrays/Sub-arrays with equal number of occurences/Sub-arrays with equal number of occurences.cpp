// Approach-1
// T.C : O()
// S.C : O()
class Solution {
  public:
    int sameOccurrence(vector<int>& arr, int x, int y) {
        // code here
        int cx = 0 ,cy = 0;
        int res = 0 ;
        map<int,int> map;
        map[0] =1;
        for(int i = 0  ; i<arr.size();i++){
            
            if(arr[i] == x) cx++;
            if(arr[i] == y) cy++;
            int dif = cx-cy;
            
            if(map.find(dif) != map.end()) res += map[dif];
            
            map[dif]++;
        }
        return res;
    }
};