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

 //Approach-1
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode node=head;
        while(node!=null){
            n++;
            node=node.next;
        }
        int eachBucket=0,r=0;
        if(n<=k)
            p=1;
        else{
            p=n/k;
            r=n%k;
        }
        ListNode[] ans=new ListNode[k];
        int idx=0;
        node=head;
        while(k>0){
            ListNode prev=null;
            int temp=p;
            ans[idx++]=node;
            while(temp>0 && node!=null){
                prev=node;
                node=node.next;
                temp--;
            }
            if(r>0){
                prev=node;
                node=node.next;
                r--;
            }
            if(prev!=null)
                prev.next=null;
            k--;
        }
        return ans;
    }
}

//Approach-1
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int eachBucketNodes=n/k;
        int remainderNodes=n%k;
        ListNode[] ans=new ListNode[k];
        curr=head;
        ListNode prev=null;
        for(int i=0; i<k && curr!=null; i++){
            ans[i]=curr;
            for(int count=1; count<=eachBucketNodes+(remainderNodes > 0 ? 1 : 0); count++){
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null)
                prev.next=null;
            remainderNodes--;
        }
        return ans;
    }
}