// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        
        // Initialize the answer list with -1
        for (int i = 0; i < arr.size(); i++) {
            ans.add(-1);
        }
        
        for (int i : arr) {
            if (i != -1 && i < ans.size()) {
                ans.set(i, i);
            }
        }
        
        return ans;
    }
}