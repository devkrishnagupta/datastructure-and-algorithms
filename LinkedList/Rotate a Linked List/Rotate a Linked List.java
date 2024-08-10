// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node ptr = head;
        Node pre_ptr = null;
        while(k > 0 && ptr != null){
            pre_ptr = ptr;
            ptr = ptr.next;
            k--;
        }
        
        if(ptr == null){
            return head;
        }
        
        pre_ptr.next = null;
        
        Node new_head = ptr;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        
        ptr.next = head;
        
        return new_head;
    }
}

// Approach-1.1
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        while(k > 1){
            temp = temp.next;
            k--;
        }
        
        Node ans = temp.next;
        temp.next = null;
        
        temp = ans;
        if(temp == null){
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = head;
        
        return ans;
    }
}