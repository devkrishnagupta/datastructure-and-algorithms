// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        while(head!=null && head.next!=null){
            head.next = head.next.next;
            head=head.next;
        }
    }
}