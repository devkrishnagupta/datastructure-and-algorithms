class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int l=n/2;l>0;l--){
            if(n%l==0){
                int times=n/l;
                String pattern=s.substring(0, l);
                String newString="";
                while(times>0){
                    newString+=pattern;
                    times--;
                }
                if(newString.equals(s))
                    return true;
            }
        }
        return false;
    }
}