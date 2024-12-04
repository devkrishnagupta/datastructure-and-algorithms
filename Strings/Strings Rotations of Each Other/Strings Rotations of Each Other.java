// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)
// TLE
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        int n = s1.length();
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                int idx = ( i + j ) % n;
                if(s1.charAt(idx) != s2.charAt(j)){
                    break;
                }
                count++;
            }
            if(count == n) return true;
        }
        
        return false;
    }
}

// Approach-1
// T.C : O(n * n)
// S.C : O(1)
// TLE
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String s = s1 + s1;
        return s.contains(s2);
    }
}

// Approach-2 (Linked List)
// T.C : O(n)
// S.C : O(n)
class Node {
    Node next;
    char data;
    
    Node(char data){
        this.data = data;
    }
}

class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        int n = s1.length();
        Node head = null;
        construct(head, s1, 0);
    }
    
    public static void construct(Node head, String s1, int idx){
        if(head == null){
            head = new Node(s1.charAt(idx));
            construct(head, s1, idx + 1);
        }else {
            head.next = new Node(s1.charAt(idx));
            construct(head.next, s1, idx + 1);
        }
    }
}
// ----------------





// Approach-2 (KMP Algorithm)
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        StringBuilder temp = new StringBuilder(s2);
        temp.append('$').append(s1).append(s1);
        int n = temp.length(),i=0,j=1,m=s2.length();
        int lps[] = new int[n];
        Arrays.fill(lps,0);
        String str = temp.toString();
        while(j<n){
            if(str.charAt(i)==str.charAt(j)){
                lps[j++]=++i;
                if(i==m)return true;
            }
            else if(i!=0)i=lps[i-1];
            else j++;
        }
        return false;
    }
}
