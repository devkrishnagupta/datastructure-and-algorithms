// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Function to find the vertical width of a Binary Tree.
    static int mn=0,mx=0;
    void help(Node root,int pos){
        if(root==null)return;
        mn=Math.min(mn,pos);
        mx=Math.max(mx,pos);
        help(root.left,pos-1);
        help(root.right,pos+1);
    }
    public int verticalWidth(Node root) {
        // code here.
        if(root==null)return 0;
        mn=0;
        mx=0;
        help(root,0);
        return mx+Math.abs(mn)+1;
    }
}