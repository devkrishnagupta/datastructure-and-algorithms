//{ Driver Code Starts
//Initial Template for Java




//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
			    Solution g=new Solution();
                System.out.println(g.isSumProperty(root));
    	        
	        }
	}
}


// } Driver Code Ends


//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/


// Approach-1 (Using DFS)
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        return solve(root) ? 1 : 0;
    }
    
    public static boolean solve(Node root){
        if(root == null)
            return true;
        if(root.left == null && root.right == null){
            return true;
        }
        
        if(root.left == null){
            return root.data == root.right.data && solve(root.right);
        }
        
        if(root.right == null){
            return root.data == root.left.data && solve(root.left);
        }
        
        if(root.data != (root.left.data + root.right.data)){
            return false;
        }
        
        return solve(root.left) && solve(root.right);
    }
}
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        return solve(root) ? 1 : 0;
    }
    
    public static boolean solve(Node root){
        if(root == null)
            return true;
        if(root.left == null && root.right == null){
            return true;
        }
        
        int sum = 0;
        if(root.left != null){
            sum += root.left.data;
        }
        
        if(root.right != null){
            sum += root.right.data;
        }
        
        return root.data == sum && solve(root.left) && solve(root.right);
    }
}

// Approach-2 (Using BFS)
// T.C : O(n)
// S.C : O(Width of the tree)
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                if(curr.left != null || curr.right != null){
                    int left = curr.left == null ? 0 : curr.left.data;
                    int right = curr.right == null ? 0 : curr.right.data;
                    if(curr.data != (left + right))
                        return 0;
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);
                }
            }
        }
        
        return 1;
    }
}