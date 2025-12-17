class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] prev = ans.get(ans.size() - 1);
            int[] curr = arr[i];

            // Overlapping meetings
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]); //
            } 
            // Non-overlapping
            else {
                ans.add(curr);
            }
        }
        return ans;
    }
}
