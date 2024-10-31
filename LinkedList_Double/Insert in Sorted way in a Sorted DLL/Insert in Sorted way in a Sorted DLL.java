// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public Node sortedInsert(Node head, int x) {
        Node node = new Node(x);
        if(x<head.data){
            node.next=head;
            head.prev=node;
            return node;
        }
        
        Node cur = head;
        while(cur.next!=null && cur.next.data<x){
            cur = cur.next;
        }
        
        
        node.next=cur.next;
        node.prev=cur;
        node.prev.next=node;
        
        //check if next node is not_null
        if(node.next!=null){
            node.next.prev=node;
        }
        
        return head;
    }
}