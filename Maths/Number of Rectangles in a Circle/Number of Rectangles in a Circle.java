// Approach-1 ( l^2 + b^2 = 4 * r^2)
// T.C : O(r * r)
// S.C : O(1)
class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int ans=0;
        for(int x=1;x<=2*r;x++){
            for(int y=1;y<=2*r;y++){
                if(x*x + y*y <= 4*r*r){
                    ans++;
                }
            }
        }
        return ans;
    }
};