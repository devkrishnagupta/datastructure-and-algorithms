//{ Driver Code Starts
import java.util.*;
import java.io.*;

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


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	    Node result = mergeTwoLists(node1, node2);
	    result = reverseList(result);
	    return result;
    }
    
    Node mergeTwoLists(Node list1, Node list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        Node result;
        if(list1.data < list2.data) {
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
        }
        return result;
    }
    
    Node reverseList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node last = reverseList(head.next); //last = future head

        head.next.next = head;
        head.next = null;
        return last;
    }
}
