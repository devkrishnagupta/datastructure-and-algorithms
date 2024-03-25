// Approach-1 (Map, which store the frquencies)
// T.C : O(n)
// S.C : O(n)

// APproach-2 (As given 1 <= arr[i] <= n, then (arr[i] - ) can be taken as index)
// T.C : O(n)
// S.C : O(1)
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);

            if (nums[num - 1] < 0) {
                result.add(num);
            } else {
                nums[num - 1] *= -1;
            }
        }

        return result;
    }
}