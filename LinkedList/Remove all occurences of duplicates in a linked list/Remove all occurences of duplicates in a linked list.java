// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head.next==null)return head;
        Node ans=new Node(-1),prev=head;
        Node temp=ans;
        head=head.next;
        int count=1;
        while(head!=null){
            if(prev.data==head.data)count++;
            else if(count==1){
                temp.next=prev;
                temp=temp.next;
            }
            else count=1;
            prev=head;
            head=head.next;
        }
        if(count==1)temp.next=prev;
        else
        temp.next=null;
        return ans.next;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    public Node removeAllDuplicates(Node head){
        Node dummy=new Node(-1),cur=dummy;
        while(head!=null){
            int x=0;
            while(head!=null&&head.next!=null&&head.data==head.next.data){
                x=head.next.data;
                head=head.next.next;
            }
            if(head!=null&&x!=head.data){
                cur.next=new Node(head.data);
                cur=cur.next;
            }
            if(head!=null)
                head=head.next;
        }
        return dummy.next;
    }
}