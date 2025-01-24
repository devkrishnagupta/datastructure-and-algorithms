// Approach-1 (Using Extra Space)
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Set<Node> nodes = new HashSet<>();
        
        while(head != null){
            if(nodes.contains(head)){
                return true;
            }
            nodes.add(head);
            head = head.next;
        }
        
        return false;
    }
}

// Approach-2 (Two Pointer Algorithm)
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        
        return false;
    }
}