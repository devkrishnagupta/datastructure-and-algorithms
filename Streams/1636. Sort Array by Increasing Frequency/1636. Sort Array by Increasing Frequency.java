// Approach-1
// T.C : O(n) + O(n * logN) ~   O(n * logN)
// S.C : O(n)
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Long> freq = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int[] ans = Arrays.stream(nums).boxed().sorted((a, b) -> {
            int diff = Long.compare(freq.get(a), freq.get(b));
            return diff == 0 ? Integer.compare(b, a) : diff;
        }).mapToInt(Integer::valueOf).toArray();
        
        return ans;
    }
}
