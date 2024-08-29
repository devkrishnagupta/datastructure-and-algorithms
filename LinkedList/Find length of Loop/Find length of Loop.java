// Approach-1 (Using Set)
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Set<Node> set = new HashSet<>();
        int ans = 0;
        Node temp = head;
        while(temp != null){
            if(set.contains(temp)){
                break;
            }
            set.add(temp);
            temp = temp.next;
            ans++;
        }
        
        Node temp1 = head;
        while(temp1 != null && temp != temp1){
            ans--;
            temp1 = temp1.next;
        }
        
        return ans;
    }
}

// Approach-1 (Using Two pointer to detect thye cycle, if cycle is present then, finding length)
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        
        if(fast == null || fast.next == null)
            return 0;
        
        int ans = 1;
        Node temp = slow.next;
        while(temp != slow){
            temp = temp.next;
            ans++;
        }
        
        return ans;
    }
}