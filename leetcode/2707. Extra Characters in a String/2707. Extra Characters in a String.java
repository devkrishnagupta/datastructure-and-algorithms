class Solution {
    HashSet<String> set;
    int n;
    int[] memo;
    public int minExtraChar(String s, String[] dictionary) {
        set=new HashSet<>();
        n=s.length();
        memo=new int[n+1];
        Arrays.fill(memo, -1);
        for(String val: dictionary){
            set.add(val);
        }
        return solve(0, s);
    }
    
    public int solve(int idx, String s){
        if(idx>=n){
            return 0;
        }
        if(memo[idx]!=-1)return memo[idx];
        int minExtra=n;
        String currStr="";
        for(int i=idx;i<n;i++){
            currStr+=s.charAt(i);
            int currExtra=set.contains(currStr) ? 0 : currStr.length();
            int nextExtra=solve(i+1, s);
            int totalExtra=currExtra+nextExtra;
            minExtra=Math.min(minExtra, totalExtra);
        }
        return memo[idx]=minExtra;
    }
}