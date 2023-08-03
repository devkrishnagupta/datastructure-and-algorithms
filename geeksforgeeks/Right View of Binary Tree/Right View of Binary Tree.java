class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                Node curr = q.poll();
                if(i==len-1)
                    ans.add(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return ans;
    }
}
