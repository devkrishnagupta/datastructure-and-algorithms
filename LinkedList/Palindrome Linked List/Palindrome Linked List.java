// Approach-1 (Brute Force) Using Storing the data and check for Palindrome
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        List<Integer> al = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            al.add(temp.data);
            temp = temp.next;
        }
        
        int n = al.size();
        for(int i = 0; i < n / 2; i++){
            if(al.get(i).intValue() != al.get(n - i - 1).intValue()){
                return false;
            }
        }
        
        return true;
    }
}

// Approach-2 (After reversing the second half)
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        if(head == null || head.next == null){
            return true;
        }
        
        // Step 1. Find the middle element using two pointer
        Node slow = head, fast = head;
        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2. Reverse the second half
        Node prev = null, curr = slow, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Step 3. Compare the first Half and reversed second half.
        Node left = head;
        Node right = prev;
        while(left != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        
        return true; // if all value matched
    }
}