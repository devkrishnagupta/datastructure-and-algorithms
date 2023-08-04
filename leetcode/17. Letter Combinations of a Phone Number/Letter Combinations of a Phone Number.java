class Solution {
    List<String> ans=new ArrayList<>();
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        solve(0, digits, "");
        return ans;
    }
    
    public void solve(int idx, String digits, String temp){
        if(idx==digits.length()){
            if(temp.length()>0)
                ans.add(temp);
            return;
        }
        char ch = digits.charAt(idx);
        String str=map[ch-'0'];
        for(int i=0;i<str.length();i++){
            temp=temp+str.charAt(i);
            solve(idx+1, digits, temp);
            temp=temp.substring(0, temp.length() - 1);
        }
    }
}