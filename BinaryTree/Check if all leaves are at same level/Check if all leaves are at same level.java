//{ Driver Code Starts
//Initial Template for Java

// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;

// A Binary Tree node
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

class Is_Leaves_At_Same_Level
{
    
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

    // driver function to test the above functions
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
        
            Solution g = new Solution();
	    	boolean b = g.check(root);
		   	if(b == true)
		    	System.out.println(1);
	    	else
		   	    System.out.println(0);
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/


// Approach-1 (Using BFS)
// T.C : O(n)
// S.C : O(Maximum Width of the tree)
class Solution
{
    boolean check(Node root)
    {
	// Your code here	
	    
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    
	    while(!q.isEmpty()){
	        
	        int size = q.size();
	        boolean isLeafFound = false;
	        for(int i = 0; i < size; i++){
	            Node curr = q.poll();
	            if(curr.left == null && curr.right == null){
	                isLeafFound = true;
	            }
	            if(curr.left != null)
	                q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
	        }
	        if(isLeafFound && !q.isEmpty()){
	            return false;
	        }
	    }
	    
	    return true;
    }
}

// Approach-2 (Using DFS)
// T.C : O(n)
// S.C : O(Hight of tree)
class Solution
{
    int levelFound;
    
    boolean check(Node root)
    {
	// Your code here
	    levelFound = -1;
	    solve(root, 0);
	    return levelFound != -2;
    }
    
    void solve(Node root, int level){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            if (levelFound != -1) {
                levelFound = (levelFound != level) ? -2 : levelFound;
            } else {
                levelFound = level;
            }
            return;
        }
        
        if(root.left != null){
            solve(root.left, level + 1);
        }
        
        if(root.right != null){
            solve(root.right, level + 1);
        }
    }
}