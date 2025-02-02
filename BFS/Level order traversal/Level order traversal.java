// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                temp.add(curr.data);
            }
            ans.add(temp);
        }
        return ans;
    }
}