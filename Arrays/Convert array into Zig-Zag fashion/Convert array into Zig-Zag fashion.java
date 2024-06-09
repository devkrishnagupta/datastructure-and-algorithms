// Approach-1 (Sort the array and from each one element from left and right)
// T.C : O(n * logN)
// S.C : O(1)

// Approach-1 (Brute Force)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public static void zigZag(int n, int[] arr) {
        // code here
        boolean flag = true;
        int i = 0;
        while(i < n - 1){
            if(flag){
                if(arr[i] >= arr[ i + 1]){
                    swap(arr, i, i + 1);
                }
            }else{
                if(arr[i] <= arr[ i + 1]){
                    swap(arr, i, i + 1);
                }
            }
            flag = !flag;
            i++;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}