// Approach 1 Brute Force Using Recursion (Take All Subset)
// T.C : O(2^n)
// S.C : O()
class Solution {
    public int maxSubsetXOR(int[] arr) {
        return solve(arr, 0, 0);
    }

    private int solve(int[] arr, int idx, int xor) {
        if (idx == arr.length)
            return xor;

        // Exclude current element
        int notTake = solve(arr, idx + 1, xor);

        // Include current element
        int take = solve(arr, idx + 1, xor ^ arr[idx]);

        return Math.max(take, notTake);
    }
}

// Approach - 2 Brute Force Using Bitmasking (for n = 3, (1 << n) equal to 8 as it left shift by 3 bit)
// T.C : O(2^n)
// S.C : O()
class Solution {
    public int maxSubsetXOR(int[] arr) {
        int n = arr.length;
        int max = 0;

        // Generate all subsets
        for (int mask = 0; mask < (1 << n); mask++) {
            int xor = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= arr[i];
                }
            }

            max = Math.max(max, xor);
        }

        return max;
    }
}

// Approach-3, XOR Basis (Gaussian Elimination over bits), which runs in O(32 × n).
// T.C : O()
// S.C : O()
class Solution {
    public int maxSubsetXOR(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Process bits from MSB to LSB
        for (int bit = 31; bit >= 0; bit--) {

            int maxIndex = -1;

            // Find an element with current bit set
            for (int i = index; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    maxIndex = i;
                    break;
                }
            }

            if (maxIndex == -1)
                continue;

            // Bring pivot to current index
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;

            // Eliminate this bit from all other numbers
            for (int i = 0; i < n; i++) {
                if (i != index && (arr[i] & (1 << bit)) != 0) {
                    arr[i] ^= arr[index];
                }
            }

            index++;
        }

        // Build maximum XOR
        int ans = 0;
        for (int x : arr) {
            ans = Math.max(ans, ans ^ x);
        }

        return ans;
    }
}