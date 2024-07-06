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