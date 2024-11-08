// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
        String temp=s1;
        int count=1;
        while(s1.length()<s2.length()){
            s1=s1+temp;
            count++;
        }
        if(s1.indexOf(s2)!=-1) return count;
        s1=s1+temp;
        count++;
        if(s1.indexOf(s2)!=-1) return count;
        return -1;
    }
};