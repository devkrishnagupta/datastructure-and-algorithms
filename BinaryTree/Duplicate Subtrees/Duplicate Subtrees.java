// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    String help(Node root,List<Node> ans,HashMap<String,Integer> mm){
        if(root==null)return "#";
        String temp = Integer.toString(root.data)+" "+help(root.left,ans,mm)+" "+help(root.right,ans,mm);
        if(mm.get(temp)!=null && mm.get(temp)==1)ans.add(root);
        mm.put(temp,mm.getOrDefault(temp,0)+1);
        return temp;
    }
    public List<Node> printAllDups(Node root) {
        // code here
        List<Node> ans = new ArrayList<>();
        HashMap<String,Integer> mm = new HashMap<>();
        help(root,ans,mm);
        return ans;
    }
}