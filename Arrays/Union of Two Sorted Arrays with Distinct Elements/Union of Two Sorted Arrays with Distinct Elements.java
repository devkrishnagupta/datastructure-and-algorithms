// Approach-1
// T.C : O(n)
// S.C : O(n) for storing the result
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int idx1 = 0, idx2 = 0, n1 = a.length, n2 = b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(idx1 < n1 || idx2 < n2){
            int a1 = idx1 < n1 ? a[idx1] : Integer.MAX_VALUE;
            int b1 = idx2 < n2 ? b[idx2] : Integer.MAX_VALUE;
            if(a1 == b1){
                ans.add(a[idx1]);
                idx1++;idx2++;
            }else if(a1 < b1){
                ans.add(a[idx1++]);
            }else{
                ans.add(b[idx2++]);                
            }
        }
        return ans;
    }
}