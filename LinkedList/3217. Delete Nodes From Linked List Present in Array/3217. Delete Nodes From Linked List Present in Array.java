// Approach-1 (Using New Node added at beginning)
// T.C : O(n)
// S.C : O(n)
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> nodes = new HashSet<>();
        for(int node: nums){
            nodes.add(node);
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp = dummy;
        while(temp != null){
            if(temp.next != null && nodes.contains(temp.next.val)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        
        return dummy.next;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(n)
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> nodes = new HashSet<>();
        for(int node: nums){
            nodes.add(node);
        }
        
        // Handling Heads
        while(head != null && nodes.contains(head.val)){
            head = head.next;
        }
        
        // Handling intermediate Nodes
        ListNode curr = head;
        while(curr != null){
            if(curr.next != null && nodes.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        
        return head;
    }
}