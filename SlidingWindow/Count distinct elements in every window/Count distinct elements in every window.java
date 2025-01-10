// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        int n = arr.length, idx = 0;
        
        while(idx < n){
            freq.put(arr[idx], freq.getOrDefault(arr[idx], 0) + 1);
            if(idx + 1 >= k){
                ans.add(freq.size());
                
                int leftElement = arr[idx - k + 1];
                if(freq.get(leftElement) == 1)
                    freq.remove(leftElement);
                else
                    freq.put(leftElement, freq.get(leftElement) - 1);
            }
            idx++;
        }
        
        return ans;
    }
}