// Approach-1
// T.C : O(n + m)
// S.C : O(n + m)
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> union = new HashSet<>();
        for(int val: a){
            union.add(val);
        }
        for(int val: b){
            union.add(val);
        }
        return union.size();
    }
}
