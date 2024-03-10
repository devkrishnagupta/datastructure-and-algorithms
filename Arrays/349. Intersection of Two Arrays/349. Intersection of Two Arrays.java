// Approach-1
// T.C : O(n * n)
// S.C : O(n)  ~    for storing result
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Set<Integer> common = new HashSet<>();
        
        for(int i = 0; i < n1; i++){
            if(!common.contains(nums1[i])){
               for(int j = 0; j < n2; j++){
                    if(nums1[i] == nums2[j]){
                        common.add(nums1[i]);
                        break;
                    }
                }     
            }           
        }
        
        int[] ans = new int[common.size()];
        int idx = 0;
        for(int val: common){
            ans[idx++] = val;
        }
        
        return ans;
    }
}

// approach-2(Binray search)
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Arrays.sort(nums2);
        
        Set<Integer> common = new HashSet<>();
        
        for(int i = 0; i < n1; i++){
            if(!common.contains(nums1[i]) && bs(nums2, nums1[i])){
                common.add(nums1[i]);
            }           
        }
        
        int[] ans = new int[common.size()];
        int idx = 0;
        for(int val: common){
            ans[idx++] = val;
        }
        
        return ans;
    }
    
    public boolean bs(int[] arr, int x){
        int n = arr.length;
        int left = 0, right = n - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == x){
                return true;
            }else if(arr[mid] > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return false;
    }
}

// Approach-2 (Sorting)
// T.C : O(n * logN)
// S.C : (n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> common = new HashSet<>();
        
        int i = 0, j = 0;
        
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                common.add(nums1[i]);
                i++;j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        
        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Approach-4
// T.C : O(n)
// S.C : O(n)   //extra space used here
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Set<Integer> nums = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        
        for(int i = 0; i < n1; i++){
            nums.add(nums1[i]);
        }
        
        for(int j = 0; j < n2; j++){
            if(nums.contains(nums2[j])){
                common.add(nums2[j]);
            }
        }

        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}