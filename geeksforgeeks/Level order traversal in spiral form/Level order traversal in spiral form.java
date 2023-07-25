/*
// A Binary Tree node
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

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int level=1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int len=q.size();
            Stack<Integer> s=new Stack<>();
            for(int i=0;i<len;i++){
                Node curr=q.poll();
                if(level%2==0){
                    ans.add(curr.data);
                }else{
                    s.push(curr.data);
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            while(!s.isEmpty()){
                ans.add(s.pop());
            }
            level++;
        }
        return ans;
    }
}