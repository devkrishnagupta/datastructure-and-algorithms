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