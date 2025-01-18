// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    Node reverseList(Node head) {
        // code here
        Node curr = head, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
