//Approach-1 (Using Max Heap)
//Time => o(n) * log(n)
//Space => o(k)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ans=new int[n-k+1];
        while(j<n){
            if(pq.size()==k){
                pq.remove(nums[i-1]);
            }
            pq.add(nums[j]);
            if(j-i+1==k){
                ans[i++]=pq.peek();
            }
            j++;
        }
        return ans;
    }
}
//Time Limit Exceeded

//Approach-2
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>(); 
        int i=0, j=0, ptr=0; 
        int n = nums.length; 
        int[] res = new int[n-k+1]; 

        while(j<n){
            while(!q.isEmpty() && q.peekLast()<nums[j]){
                q.pollLast(); 
            }
        
            q.add(nums[j]);

            if(j-i+1<k){
                j++; 
            }else if(j-i+1==k){

                res[ptr++] = q.peek();
                
                if(nums[i]==q.peek()){
                    q.pollFirst(); 
                }
                i++; 
                j++;
            }
        }

        return res; 

    }
}