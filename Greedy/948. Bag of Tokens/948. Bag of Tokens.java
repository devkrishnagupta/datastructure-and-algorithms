// Approach-1 (Greedy)
// T.C : O(n)
// S.C : O(1)
class Solution {
    
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        
        int maxScore = 0;
        int score = 0;
        int  i =0, j = n - 1;
        
        while(i <= j){
            if(power >= tokens[i]){
                score++;
                power -= tokens[i];
                maxScore = Math.max(score, maxScore);
                i++;
            }else if(score > 0){
                power += tokens[j];
                score--;
                j--;
            }else{
                return maxScore;
            }
        }
        
        return maxScore;
    }
}

// Approach-2 (Recursion)
// T.C : O(2 ^ n)
// S.C : O(n)
