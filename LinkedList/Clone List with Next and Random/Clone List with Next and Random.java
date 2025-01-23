// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node temp = head;
        while(temp!=null){
            Node cloneNode = new Node(temp.data);
            cloneNode.next=temp.next;
            temp.next=cloneNode;
            temp=cloneNode.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node clone = new Node(0), ans = clone;
        temp=head;
        while(temp!=null){
            clone.next=temp.next;
            clone=clone.next;
            temp.next=clone.next;
            temp=temp.next;
        }
        return ans.next;
    }
}