
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
}*/
// Approach-1 (BFS)
// T.C : O(n)
// S,C : O(n)
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()){
          int size = q.size();
          
          for(int i = 0; i < size; i++){
              Node curr = q.poll();
              if(i == 0){
                  ans.add(curr.data);
              }
              if(curr.left != null){
                  q.add(curr.left);
              }
              if(curr.right != null){
                  q.add(curr.right);
              }
          }
      }
      
      return ans;
    }
}

// Approach-1 (DFS)
// T.C : O(n)
// S,C : O(n)
void help(Node root,ArrayList<Integer> ans,int level,Map<Integer,Integer> mm){
    if(root==null)return;
    if(mm.get(level)==null){
        ans.add(root.data);
        mm.put(level,1);
    }
    level++;
    help(root.left,ans,level,mm);
    help(root.right,ans,level,mm);
}
ArrayList<Integer> leftView(Node root)
{
  // Your code here
   ArrayList<Integer> ans = new ArrayList<>();
   Map<Integer,Integer> mm = new HashMap<>();
   help(root,ans,0,mm);
   return ans;
}