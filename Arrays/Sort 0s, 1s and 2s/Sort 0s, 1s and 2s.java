// Approach-1
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
//count zero, one and two then insert after counting

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length, zero = 0, two = n-1, i = 0;
        while(i<=two){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                zero++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[two];
                arr[two] = temp;
                two--;
                i--;
            }
            i++;
        }
    }
}
