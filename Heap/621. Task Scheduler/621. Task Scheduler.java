// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int leastInterval(char[] tasks, int p) {
        int n = tasks.length;
        Map<Character, Integer> mp = new HashMap<>();
        
        for(char ch : tasks) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max heap
        //we want to finish the process which is most occurring (having highest frequency)
        //so that we don't have to finish in the last with p gaps.
        int time = 0;
        
        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            pq.offer(entry.getValue());
        }
        
        while(!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for(int i = 1; i<=p+1; i++) {
                //filling first p+1 characters
                if(!pq.isEmpty()) {
                    int freq = pq.poll();
                    temp.add(freq - 1); //finishing one instance of each process
                }
            }
            
            for(int freq : temp) {
                if(freq > 0)
                    pq.offer(freq);
            }
            
            if(pq.isEmpty()) //all processes finished
                time += temp.size();
            else
                time += (p+1); //we finished p+1 tasks above in the loop
            
        }
        
        return time;
    }
}