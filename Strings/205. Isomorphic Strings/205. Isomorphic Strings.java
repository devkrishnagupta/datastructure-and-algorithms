// Approach-1
// T.C : O(n)
// S.C : O(26)  ~   O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mps = new int[256];
        int[] mpt = new int[256];
        
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(mps[ch1] != 0 && mps[ch1] != ch2 || mpt[ch2] != 0 && mpt[ch2] != ch1){
                return false;
            }
            
            mps[ch1] = ch2;
            mpt[ch2] = ch1;
        }

        return true;
    }
}