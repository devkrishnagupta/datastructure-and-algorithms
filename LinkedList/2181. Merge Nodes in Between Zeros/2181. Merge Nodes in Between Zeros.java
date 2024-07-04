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