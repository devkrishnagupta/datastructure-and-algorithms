// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j=0,n=arr.length;
        for(int i=0;i<n;i++)
        {
            pq.offer(arr[i]);
            if(i>=k)arr[j++]=pq.poll();
        }
        while(!pq.isEmpty())arr[j++]=pq.poll();
    }
}