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


// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy, nth = dummy;
        for(int i =1; i<=n+1; i++){
            current = current.next;
        }
        while(current != null){
            current = current.next;
            nth = nth.next;
        }
        nth.next = nth.next.next;
        return dummy.next;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        int del = size - n + 1;
        
        if(del == 1)
            return head.next;
        
        temp = head;
        while(del > 2){
            temp = temp.next;
            del--;
        }
        
        if(temp.next.next == null){
            temp.next = null;
        }else{
            temp.next = temp.next.next;
        }
                
        
        return head;
    }
}