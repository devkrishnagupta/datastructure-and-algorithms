//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void deletetree(Node root) {
        if (root == null) return;
        deletetree(root.left);
        deletetree(root.right);
        root.left = null;
        root.right = null;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Tree tr = new Tree();
            ArrayList<Integer> A = tr.serialize(root);
            deletetree(root);
            root = null;

            Node getRoot = tr.deSerialize(A);
            printInorder(getRoot);
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

// Approach-1
// T.C : O(n)
// S.C : O(n)
class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    ArrayList<Integer> al;
    public ArrayList<Integer> serialize(Node root) {
        // code here
        al = new  ArrayList<Integer>();
            fun(root);
            return al;
    }
    void fun(Node root){
        if(root==null){
            al.add(-1);
            return;
        }
        al.add(root.data);
        fun(root.left);
        fun(root.right);
    }

    // Function to deserialize a list and construct the tree.
    int index;
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        index=0;
        return dfs(A);
    }
    Node dfs(ArrayList<Integer> A){
        if(index==A.size()) return null;
        
        int val = A.get(index);
        index++;
        
        if(val==-1) return null;
        
        Node root = new Node(val);
        root.left = dfs(A);
        root.right = dfs(A);
        
        return root;
        
    }
};















// ###################
class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root, arr);
        return arr;
    }
    
    void serialize(Node root, ArrayList<Integer> arr){
        if(root == null){
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        int []index = new int[1];
        return deSerialize(arr, index);
    }
    Node deSerialize(ArrayList<Integer>arr, int[] index){
        if (arr.get(index[0]) == -1){
            ++index[0];
            return null;
        }
        Node newNode = new Node(arr.get(index[0]));
        ++index[0];
        newNode.left = deSerialize(arr, index);
        newNode.right = deSerialize(arr, index);
        return newNode;
    }
}