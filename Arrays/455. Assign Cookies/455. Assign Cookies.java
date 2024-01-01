class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int idx_g=g.length-1;
        int idx_s=s.length-1;
        while(idx_s>=0 && idx_g>=0){
            if(s[idx_s]>=g[idx_g]){
                count++;
                idx_s--;
            }
            idx_g--;
        }
        return count;
    }
}