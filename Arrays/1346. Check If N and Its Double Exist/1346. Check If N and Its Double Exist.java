// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)

// Approach-1 (Map)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n ->n, Collectors.counting()));
        
        for(int val: arr){
            int twoice = 2 * val;
            if(map.containsKey(twoice)){
                if(val == 0 && map.get(val) == 1){
                    continue;
                }
                return true;
            }
        }
        
        return false;
    }
}

// Approach-1 (Binary Search)
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    // Binary search helper function
    public int bSearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int mid;

        // Binary search logic
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        // Sorting the array before applying binary search
        Arrays.sort(arr);

        // Iterate over each element in the array
        for (int i = 0; i < n; i++) {
            // Perform binary search for 2 * arr[i]
            int j = bSearch(arr, 2 * arr[i]);

            // If the element is found and it's not the same index, return true
            if (j != -1 && j != i) {
                return true;
            }
        }

        return false;
    }
}