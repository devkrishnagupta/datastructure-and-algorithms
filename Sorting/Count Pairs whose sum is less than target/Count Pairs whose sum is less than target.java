// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int count=0,s=0,e=arr.length-1;
        while(s<e){
            if(arr[s]+arr[e]>=target) e--;
            else{
                count+=e-s;
                s++;
            }
        }
        return count;
    }
}