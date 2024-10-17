// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // Edge case: if head is null, return two empty lists
        if (head == null) {
            return new Node[]{null, null};
        }

        Node first = new Node(0); // Dummy node for the first list
        Node firstAns = first;
        Node second = new Node(0); // Dummy node for the second list
        Node secondAns = second;

        while (head != null) {
            first.next = head; // Add to first list
            first = first.next; // Move to the next position in the first list
            head = head.next; // Move to the next node in the original list

            if (head != null) {
                second.next = head; // Add to second list
                second = second.next; // Move to the next position in the second list
                head = head.next; // Move to the next node in the original list
            }
        }

        // Terminate both lists
        first.next = null;
        second.next = null;

        return new Node[]{firstAns.next, secondAns.next}; // Return the heads of the two lists
    }
}