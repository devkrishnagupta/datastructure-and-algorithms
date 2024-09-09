// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        int n = arr.size();
        int zero = 0, two = n - 1, i = 0;

        while (i <= two) {
            if (arr.get(i) == 0) {
                // Swap arr[i] with arr[zero]
                int temp = arr.get(i);
                arr.set(i, arr.get(zero));
                arr.set(zero, temp);
                zero++;
                i++;
            } else if (arr.get(i) == 2) {
                // Swap arr[i] with arr[two]
                int temp = arr.get(i);
                arr.set(i, arr.get(two));
                arr.set(two, temp);
                two--;
                // Do not increment i here, recheck the swapped value
            } else {
                // arr[i] is 1, just move to the next element
                i++;
            }
        }
    }
}