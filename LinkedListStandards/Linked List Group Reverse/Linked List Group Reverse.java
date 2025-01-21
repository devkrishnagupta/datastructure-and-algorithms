// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        Node pichli=null,curr=head,agli=null,fhead=null,temp=null;
        int c=0;
        while(head!=null){
            while(curr!=null && c<k){
                agli=curr.next;
                curr.next=pichli;
                pichli=curr;
                curr=agli;
                c++;
            }
            if(fhead==null)fhead=pichli;
            if(temp!=null)temp.next=pichli;
            temp=head;
            pichli=null;
            head=curr;
            c=0;
        }
        return fhead;
    }
}