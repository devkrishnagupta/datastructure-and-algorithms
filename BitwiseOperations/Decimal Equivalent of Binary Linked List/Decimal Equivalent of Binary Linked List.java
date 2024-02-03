//{ Driver Code Starts
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class LinkedList1
{
    Node head;  // head of lisl
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String s = sc.nextLine();
        while(t>0)
        {
            int n = sc.nextInt();
            String s1 = sc.nextLine();
            LinkedList1 llist = new LinkedList1();

            if (n > 0)
            {
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
            }
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            System.out.println(new Solution().DecimalValue(llist.head));
            t--;
        }
    }
}


// } Driver Code Ends


/* Node of a linked list
    class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
    Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */



// Approach-2 Brute Force approach, Count the nodes then apply the make the decimal number by last digit power function.
// T.C : O(n)
// S.C : O(1)
class Solution
{
   long DecimalValue(Node head)
   {
 	    if(head == null) return 0L;
 	    
 	    int count = 0;
 	    long ans = 0;
 	    long mod = (long) 1e9 + 7;
 	    int mod1 = 1000000007;
 	    Node temp = head;
        
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            ans = (ans + (temp.data * pow(2, count, mod1)) % mod1 ) % mod1;
            count--;
            temp = temp.next;
        }
        
        return ans % mod1;
   }
   
     long pow(int base, int exponent, int mod) {
        long result = 1;
        long baseLong = base;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * baseLong) % mod;
            }
            baseLong = (baseLong * baseLong) % mod;
            exponent /= 2;
        }

        return result;
    }
}

// Approach-2 The approach like this (n + (n-1) + (n-2) + (n-3) + (n-4) ..... + 1) * 2
// T.C : O(n)
// S.C : O(1)
class Solution
{
    long DecimalValue(Node head)
    {
            long MOD = 1000000007;
            long result = 0;
            
            while(head != null){
                result = ((result * 2) % MOD + head.data) % MOD;
                head = head.next;
            }
            
            return result;
    }
}