// Approach-1
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, target, ans);
        return ans;
    }
    
    public boolean solve(Node root, int target, ArrayList<Integer> ans){
        if(root == null)
            return false;
        if(root.data == target){
            return true;
        }
        
        boolean left = solve(root.left, target, ans);
        if(left){
            ans.add(root.data);
            return true;
        }
        boolean right = solve(root.right, target, ans);
        if(right){
            ans.add(root.data);
            return true;
        }
        
        return false;
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(Height of the tree)
class Solution {
    ArrayList<Integer> ans;
    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ans = new ArrayList<>();
        solve(root, target, ans);
        Collections.reverse(ans);
        return ans;
    }
    
    public void solve(Node root, int target, ArrayList<Integer> temp){
        if(root == null)
            return;
        if(root.data == target){
            ans.addAll(temp);
            return;
        }
        temp.add(root.data);
        solve(root.left, target, temp);
        solve(root.right, target, temp);
        temp.remove(temp.size()-1);
    }
}