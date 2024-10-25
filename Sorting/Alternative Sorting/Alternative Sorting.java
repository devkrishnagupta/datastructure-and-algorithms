// Approach-1
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Your code goes here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,j=n-1;
        for(int k=0;k<n;k++){
            if(k%2==1)ans.add(arr[i++]);
            else ans.add(arr[j--]);
        }
        return ans;
    }
}