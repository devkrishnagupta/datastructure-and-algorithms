//Approach-1 (Simulation) 
//T.C : O(nlogn)
//S.C : O(1)
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        
        boolean skip = false;
        
        int i = 0; // deck
        int j = 0; // result
        
        Arrays.sort(deck);
        
        while (i < n) {
            if (result[j] == 0) { // khali hai
                if (!skip) {
                    result[j] = deck[i];
                    i++;
                }
                
                skip = !skip; // alternate
            }
            
            j = (j + 1) % n;
        }
        
        return result;
    }
}



//Approach-2 (Simulation using Queue) 
//T.C : O(nlogn)
//S.C : O(n)
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        
        Queue<Integer> que = new LinkedList<>();
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            que.offer(i);
        }
        
        Arrays.sort(deck);
        
        for (int i = 0; i < n; i++) {
            int idx = que.poll();
            result[idx] = deck[i];
            
            if (!que.isEmpty()) {
                que.offer(que.peek());
                que.poll();
            }
        }
        
        return result;
    }
}