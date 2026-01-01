// Approach-1 (Take first and search in other)
// T.C : O(m * n)
// S.C : 1

// Approach-2 (Using extra space)
// T.C : O(m + n)
// S.C : O(m) or O(n)
class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Set<Node> set = new HashSet<>();
        while(head1 != null){
            set.add(head1);
            head1 = head1.next;
        }
        
        while(head2 != null){
            if(set.contains(head2)){
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
}

// Approach-3 (Using length diffence)
// T.C : O(m + n)
// S.C : O(1)
class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp = head1;
        int n1 = 0, n2 = 0;
        while(temp != null){
            n1++;
            temp = temp.next;
        }
        temp = head2;
        while(temp != null){
            n2++;
            temp = temp.next;
        }
        int diff = n1 - n2;
        while(diff > 0){
            diff--;
            head1 = head1.next;
        }
        diff = n2 - n1;
        while(diff > 0){
            diff--;
            head2 = head2.next;
        }
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
}

// Approach-3 (With Optimal Solution)
// T.C : O(n + m)
// S.C : O(1)
class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node p1 = head1, p2 = head2;
        while(p1 != p2){
            p1 = p1 == null ? head2 : p1.next;
            p2 = p2 == null ? head1 : p2.next;
        }
        return p1;
    }
}
/*
Key idea (Two-pointer switch method)

Use two pointers p1 and p2

Traverse head1 and head2

When a pointer reaches the end, redirect it to the other list’s head

If the lists intersect, the pointers will meet exactly at the intersection node

Why it works:

Each pointer travels length1 + length2

Length difference is automatically balanced
*/