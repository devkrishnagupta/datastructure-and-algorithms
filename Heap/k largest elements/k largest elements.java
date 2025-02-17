// Approach-1
// T.C : O(n + k + (k * logK))
// S.C : O(n + k)
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val: arr){
            pq.add(val);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty() && k > 0){
            ans.add(pq.poll());
            k--;
        }
        
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}


// Approach-2
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int val: arr){
            ans.add(val);
        }
        
        Collections.sort(ans, Collections.reverseOrder());

        return new ArrayList<Integer>(ans.subList(0, k));
    }
}
