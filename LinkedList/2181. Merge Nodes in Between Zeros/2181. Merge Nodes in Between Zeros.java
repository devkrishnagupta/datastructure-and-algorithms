// Approach-1
// T.C : O(n)
// S.C : O(1)
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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = head;
        ListNode temp = head.next;
        int currSum = 0;
        while(temp != null){
            if(temp.val == 0){
                temp.val = currSum;
                currSum = 0;
                prev.next = temp;
                prev = temp;
            }else{
                currSum += temp.val;
            }
            temp = temp.next;
        }
        
        return head.next;
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode P1 = head.next;
        ListNode P2 = P1;
        
        while(P2 != null){
            int sum = 0;
            while(P2 != null && P2.val != 0){
                sum += P2.val;
                P2 = P2.next;
            }
            
            P1.val = sum;
            P2 = P2.next;
            P1.next = P2;
            P1 = P1.next;
        }
        
        return head.next;
    }
}

// Approach-1 (Recursion leap of faith)
// T.C : O(n)
// S.C : O(1) + O(n)stack ~ O(n)
class Solution {
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        if(head == null){
            return head;
        }
        
        ListNode temp = head;
        int sum = 0;
        
        while(temp != null && temp.val != 0){
            sum += temp.val;
            temp = temp.next;
        }
        
        head.val = sum;
        head.next = mergeNodes(temp); //Recursion leap of faith
        
        return head;
    }
}