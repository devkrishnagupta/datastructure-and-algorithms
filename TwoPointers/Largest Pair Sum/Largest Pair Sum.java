// Approach-1 (Two Pointer)
// T.C : O()
// S.C : O()
class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int max = -1, secondMax = -1;
        
        for(int val: arr){
            if(val > max){
                secondMax = max;
                max = val;
            }else if(val > secondMax){
                secondMax = val;
            }
        }
        
        return max + secondMax;
    }
}

// Approach-1 (PriorityQueue)
// T.C : O()
// S.C : O()
