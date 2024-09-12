// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}