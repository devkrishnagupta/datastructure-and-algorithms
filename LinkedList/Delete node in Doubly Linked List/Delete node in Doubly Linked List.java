// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1)return head.next;
        int count=1;
        Node temp=head;
        while(count<x){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
        if(temp.next!=null)temp.next.prev=temp.prev;
        return head;
    }
}