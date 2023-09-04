/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//Approach-1 (USING HashSet as HashSet searching time is O(1))
//TIME => O(N)
//Space => O(N)
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
}

//Approach-2 (Using fast and slow pointers)
//Time => o(N)
//Space => O(1)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        if(head.next==null)return false;
        ListNode slow=head, fast=head;
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
}