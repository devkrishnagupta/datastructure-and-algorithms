// Approach-1 (Using Array)
// T.C : O((n + m) * log(N + M))
// S.C : O(n + m)


// Approach-2
// T.C : O()
// S.C : o()
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node p1 = head1, p2 = head2, temp = new Node(-1), head = temp;
        while(p1 != null && p2 != null){
            if(p1.data <= p2.data){
                temp.next = p1;
                p1 = p1.next;
            }else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        
        temp.next = p1 != null ? p1 : p2;
        
        return head.next;
    }
}