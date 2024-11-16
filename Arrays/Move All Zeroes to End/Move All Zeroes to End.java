// Approach-1
// T.C : O(n)
// S.C: O(1)
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j++]=temp;
            }
        }
    }
}