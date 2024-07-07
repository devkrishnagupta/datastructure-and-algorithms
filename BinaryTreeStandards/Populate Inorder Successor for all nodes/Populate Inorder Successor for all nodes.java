// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    Node nxt = null;
    public void populateNext(Node root) {
        // code here
        if(root == null) return;
        populateNext(root.right);
        root.next = nxt;
        nxt = root;
        populateNext(root.left);
    }
}

// Approach-2
// T.C : O()
// S.C : O()
class Solution2 {
    ArrayList<Node> al;
    public void populateNext(Node root) {
        // code here
        al = new ArrayList<>();
        in_order(root);
        
        for(int i=0; i<al.size()-1; i++){
            al.get(i).next = al.get(i+1);
        }
    }
    void in_order(Node root){
        if(root==null) return;
        in_order(root.left);
        al.add(root);
        in_order(root.right);
    }
}