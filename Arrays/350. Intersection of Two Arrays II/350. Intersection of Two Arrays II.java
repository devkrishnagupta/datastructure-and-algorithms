// Approach-1 (Sort the both Array)
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                al.add(nums1[i]);
                i++;j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        
        int[] ans = al.stream().mapToInt(Integer::valueOf).toArray();
        
        return ans;
    }
}

// Approach-2 (Using Map)
// T.C : O(n)
// S.C : O(n)
class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Long> freq = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        List<Integer> al = new ArrayList<>();
        
        for(int key: nums2){
            if(freq.containsKey(key) && freq.get(key) > 0){
                al.add(key);
                freq.put(key, freq.get(key) - 1);
            }
        }
        
        int[] ans = al.stream().mapToInt(Integer::valueOf).toArray();
        
        return ans;
    }
}