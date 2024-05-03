//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/

// Approach-1
// T.C : O(n * n)
// S.C : O(n)
class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        
        int inStart = 0;
        int inEnd = n - 1;
        int postStart = 0;
        int postEnd = n - 1;
        
        return solve(in, post, inStart, inEnd, postStart, postEnd);
    }
    
    Node solve(int[] in, int[] post, int inStart, int inEnd, int postStart, int postEnd){
        if(inStart > inEnd){
            return null;
        }
        
        Node root = new Node(post[postEnd]);
        
        int i = inStart;
        for(; i < inEnd; i++){
            if(in[i] == root.data){
                break;
            }
        }
        
        int leftSize = i - inStart;
        int rightSize = inEnd - i;
        
        root.left = solve(in, post, inStart, i - 1, postStart, postStart + leftSize - 1);
        root.right = solve(in, post, i + 1, inEnd, postEnd - rightSize, postEnd - 1);
        
        return root;
    }
}
    