/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Approach-1 (Using stack)
//T.C  : O(n)
//S.C  : O(n)
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode current = head;

        while (current != null) {
            st.push(current);
            current = current.next;
        }

        current = st.pop();
        int maximum = current.val;
        ListNode resultHead = new ListNode(maximum);

        while (!st.empty()) {
            current = st.pop();
            if (current.val < maximum) {
                continue;
            }
            else {
                ListNode newNode = new ListNode(current.val);
                newNode.next = resultHead;
                resultHead = newNode;
                maximum = current.val;
            }
        }

        return resultHead;
    }
}


//Approach-2 (Using Recursion - instead of stack, use system's stack)
//T.C : O(n)
//S.C : O(n) system stack
class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode nextNode = removeNodes(head.next);

        if (head.val < nextNode.val) {
            head = null;
            return nextNode;
        }

        head.next = nextNode;
        return head;
    }
}


//Approach-3 (Using reverse)
//T.C : O(n)
//S.C : O(1)
class Solution {
    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return last;
    }
    
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maximum = 0;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            maximum = Math.max(maximum, current.val);

            if (current.val < maximum) {
                prev.next = current.next;
                ListNode deleted = current;
                current = current.next;
                deleted.next = null;
            }

            else {
                prev = current;
                current = current.next;
            }
        }
        
        return reverseList(head);
    }
}