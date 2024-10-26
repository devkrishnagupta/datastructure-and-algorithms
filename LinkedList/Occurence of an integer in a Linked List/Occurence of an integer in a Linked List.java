// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public static int count(Node head, int key) {
        // code here
        int count = 0;
        while(head != null){
            if(head.data == key)
                count++;
            head = head.next;
        }
        return count;
    }
}