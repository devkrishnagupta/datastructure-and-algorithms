// Apprioach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
        List<int[]> ans = new ArrayList<>();
        for(int[] a: arr){
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < a[0]) {
                ans.add(a);
            }else if(ans.get(ans.size() - 1)[1] >= a[0]){
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], a[1]);
            }
        }
        
        return ans;
    }
}