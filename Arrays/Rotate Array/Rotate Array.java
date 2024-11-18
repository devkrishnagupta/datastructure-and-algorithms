// Approach-1 (Brute Force)
// T.C : O(d * n)
// S.C : O(1)
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        while(d > 0){
            for(int i = 1; i < n; i++){
                swap(arr, i - 1, i);
            }
            d--;
        }
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Approach-2 (Extra Space)
// T.C : O(n)
// S.C : O(n)
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = arr[i];
        }
        for(int i = 0; i < n; i++){
            int idx = ( i + d ) % n;
            arr[i] = copy[idx]; 
        }
    }
}

// Approach-3 (Optimized)
/* Reverse first up to d length
 * Then again reverse from d length to end
 * Then Again Reverse entire array
 */
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}