// APproach-1
// T.C : O()
// S.C : O()
class Solution {

    public int maxWater(int arr[]) {
        // Code Here
       if (arr.length <= 1) return 0;

        int left = 0;                  // Left pointer
        int right = arr.length - 1;    // Right pointer
        int maxWater = 0;              // To store the maximum water that can be trapped
        
        while (left < right) {
            // Calculate the area formed by the lines at left and right pointers
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int currentWater = width * height;

            // Update maxWater if the current calculated water is greater
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line towards the other pointer
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}