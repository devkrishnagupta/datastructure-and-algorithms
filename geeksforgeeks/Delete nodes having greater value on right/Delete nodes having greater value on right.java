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


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/



//Approach-0 (every iteration remove one element which right has greater)
//Time n*n 

//Approach-1
//Time n
//Space n
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Stack<Integer> st=new Stack<>();
        Node curr=head;
        while(curr!=null){
            if(!st.isEmpty() && st.peek()<curr.data)
                st.pop();
            else{
                st.push(curr.data);
                curr=curr.next;
            }
        }
        Stack<Integer> st2=new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.peek());
            st.pop();
        }
        Node newHead=new Node(st2.pop());
        Node temp=newHead;
        while(!st2.isEmpty()){
            temp.next=new Node(st2.pop());
            temp=temp.next;
        }
        return newHead;
    }
}
  

//Approach-2
//Time n
//Space n
class Solution
{
    Node compute(Node head)
    {
        // your code here
        if(head.next==null)return head;
        Stack<Node> st=new Stack<>();
        Node newHead=new Node(Integer.MAX_VALUE);
        st.push(newHead);
        while(head!=null){
            if(st.peek().data<head.data)
                st.pop();
            else{
                st.peek().next=head;
                st.push(head);
                head=head.next;
            }
        }
        return newHead.next;
    }
}
  
//Approach-3
//Time n
//Space 1