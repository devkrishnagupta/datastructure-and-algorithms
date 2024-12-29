// Approach-1
// T.C : O(n + m)
// S.C : O(n)
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer> aSet = new HashSet();
        for(int val: a){
            aSet.add(val);
        }
        Set<Integer> ans = new HashSet<>();
        for(int val: b){
            if(aSet.contains(val)){
                ans.add(val);
            }
        }
        return new ArrayList<>(ans);
    }
}