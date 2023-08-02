//Aproach-1
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums, nums.length, new HashSet<>(), new ArrayList<>(), ans);
        return ans;
    }
    
    public void solve(int[] nums, int n, Set<Integer> set, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                temp.add(nums[i]);
                set.add(nums[i]);
                solve(nums, n, set, temp, ans);
                set.remove(Integer.valueOf(nums[i]));
                temp.remove(Integer.valueOf(nums[i]));
            }
        }
    }
}

///Aproach-2
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums, 0, nums.length, ans);
        return ans;
    }
    
    public void solve(int[] nums, int idx, int n, List<List<Integer>> ans){
        if(idx==n){
            List<Integer> list=new ArrayList<>();
            for(int x: nums)
                list.add(x);
            ans.add(list);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(i, idx, nums);
            solve(nums, idx+1, n, ans);
            swap(i, idx, nums);
        }
    }
    
    public void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

//Approach-3
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), ans, nums);
        return ans;
    }
    
    public void backtrack(List<Integer> curr, List<List<Integer>> ans, int[] nums) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for (int num: nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                backtrack(curr, ans, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}