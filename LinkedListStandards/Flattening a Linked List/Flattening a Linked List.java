/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/

// Approach-1 (Using Recursion)
// T.C : O()
// S.C : O()
class Solution {
    public Node flatten(Node root) {
        // code here
        if (root == null)
            return root;

        Node temp = flatten(root.next);
        return mergeTwoLists(root, temp);
    }
    
    Node mergeTwoLists(Node head1, Node head2) {
        if (head1 == null)
            return head2;

        if (head2 == null)
            return head1;

        Node result;
        if (head1.data < head2.data) {
            result = head1;
            result.bottom = mergeTwoLists(head1.bottom, head2);
        } else {
            result = head2;
            result.bottom = mergeTwoLists(head1, head2.bottom);
        }

        return result;
    }
}