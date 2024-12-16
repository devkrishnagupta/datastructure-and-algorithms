// Approach-1 (Brute Force) (Linear Search)
// T.C : O(n)
// S.C : O(1)
class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr,int n)
    {
        //add code here.
        
        int ans = arr[0];
        
        for(int i = 1; i < n; i++){
            if(ans > arr[i])
                return i-1;
            ans = arr[i];
        }
        
        return n - 1;
    }
}

// Approach-2 (Recursion + Binary Search)
// T.C : O(logN)
// S.C : O(logN)
class Solution {
    public int peakElement(int[] arr, int n) {
        return findPeak(arr, 0, n - 1, n);
    }

    private int findPeak(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid; // Peak element found
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeak(arr, low, mid - 1, n); // Search in the left half
        } else {
            return findPeak(arr, mid + 1, high, n); // Search in the right half
        }
    }
}

// Approach-3 (Binary Search)
// T.C : O(logN)
// S.C : O(1)
class Solution {
    public int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid; // Peak element found
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }

        return -1; // Peak element not found
    }
}
