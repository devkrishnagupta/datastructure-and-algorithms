//Approach-1
// class Solution {
// public:
    
//     int findLongestChain(vector<vector<int>>& pairs) {
//         int n = pairs.size();
//         sort(begin(pairs), end(pairs));
        
//         vector<int> t(n, 1);
//         int maxL = 1;
        
//         for(int i = 0; i<n; i++) {
//             for(int j = 0; j<i; j++) {
                
//                 if(pairs[j][1] < pairs[i][0]) {
//                     t[i] = max(t[i], t[j]+1);
//                     maxL = max(maxL, t[i]);
//                 }
//             }
//         }
        
//         return maxL;
//     }
// };

//Approach-2 (It's Not working currently, need to little bit fixed)
class ArrayComparator implements Comparator<int[]>{
    public int compare(int[] a1, int[] a2){
        return a1[1]-a2[0];
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {
        int ans=1;
        Arrays.sort(pairs, new ArrayComparator());
        int[] curr=pairs[0];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>curr[1]){
                ans++;
                curr=pairs[i];
            }
        }
        return ans;
    }
}

