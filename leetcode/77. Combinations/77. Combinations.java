//Approach-1 (Using Backtracking-1)
class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), ans);   
        return ans;
    }
    
    public void solve(int start, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(start>n)
            return;
        temp.add(start);
        solve(start+1, n, k-1, temp, ans);
        temp.remove(Integer.valueOf(start));
        solve(start+1, n, k, temp, ans);
    }
}

//Approach-1 (Using Backtracking-2)
class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), ans);   
        return ans;
    }
    
    public void solve(int start, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // if(start>n)
        //     return;
        for(int i=start;i<=n;i++){
            temp.add(i);
            solve(i+1, n, k-1, temp, ans);
            temp.remove(Integer.valueOf(i));
        }
    }
}
//or
class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}
	public void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++) {
			comb.add(i);
			combine(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}
}