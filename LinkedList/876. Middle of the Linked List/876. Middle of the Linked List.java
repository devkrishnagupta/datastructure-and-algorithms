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

 // Approach-1 (Brute Force)
 // T.C : O(n)
 // S.C : O(1)
 class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head.next == null)return head;
        
        int n = 0;
        ListNode temp = head;
        
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        n = n / 2;
        ListNode ans = head;
        
        while(n > 0){
            ans = ans.next;
            n--;
        }
        
        return ans;
    }
}

 // Approach-2 (Slow and Fast Pointer)
 // T.C : O(n/2)    ~   O(n)
 // S.C : O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head.next == null)return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}