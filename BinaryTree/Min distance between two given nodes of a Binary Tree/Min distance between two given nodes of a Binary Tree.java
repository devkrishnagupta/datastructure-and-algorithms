//{ Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

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

class Main {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}


// } Driver Code Ends


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
    in a tree with given root*/

// Approach-1 (Brute Forece - Convert into graph & make adjacency list of nodes and edges and perform BFS and find the distance)
// T.C : 
// S.C : 

// Approach-2 (Find lowest common ancester and then calculate sum of distance betwen both the nodes)
// T.C : O(n)
// S.C : O(Heigh of the tree) ~ O(logN)
class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        
        Node LCA = lca(root, a, b);
        // return Math.abs(findLevelUsingDFS(LCA, a, 0) + findLevelUsingDFS(LCA, b, 0));
        return findLevel(LCA, a) + findLevel(LCA, b);
    }
    
    int findLevel(Node root, int n){
        
        if(root == null)
            return -1;
            
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        int level = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                
                if(curr.data == n){
                    return level;
                }
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            level++;
        }
        
        return -1;
    }
    
    int findLevelUsingDFS(Node root, int n, int level){
        
        if(root == null){
            return -1;
        }
        
        if(root.data == n){
            return level;
        }
        
        int left = findLevelUsingDFS(root.left, n, level + 1);
        int right = findLevelUsingDFS(root.right, n, level + 1);
        
        if(left != -1){
            return right;
        }
        
        return left;
    }
    
    Node lca(Node root, int n1, int n2){
        
        if(root == null) return null;
        
        if(root.data == n1 || root.data == n2){
            return root;
        }
        
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        
        // if(left == null && right == null){
        //     return null;
        // }
        
        if(left != null && right != null){
            return root;
        }
        
        if(left != null && right == null){
            return left;
        }
        
        return right;
    }
}
