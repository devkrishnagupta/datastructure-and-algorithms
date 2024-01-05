//Approach-1 (TopDown: Recur+Memo) 
//T.C : O(n*n)
class Solution {
    private int n;
    private int[][] t;

    public int lis(int[] nums, int prevIdx, int currIdx) {
        if (currIdx == n)
            return 0;

        if (prevIdx != -1 && t[prevIdx][currIdx] != -1)
            return t[prevIdx][currIdx];

        int taken = 0;
        if (prevIdx == -1 || nums[currIdx] > nums[prevIdx])
            taken = 1 + lis(nums, currIdx, currIdx + 1);

        int notTaken = lis(nums, prevIdx, currIdx + 1);

        if (prevIdx != -1)
            t[prevIdx][currIdx] = Math.max(taken, notTaken);

        return Math.max(taken, notTaken);
    }

    public int lengthOfLIS(int[] nums) {
        t = new int[2501][2501];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        n = nums.length;
        return lis(nums, -1, 0);
    }
}


//Approach-2 (Bottom Up)
//T.C : O(n^2)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[] t = new int[n];
        Arrays.fill(t,1);
    
        int maxLIS = 1;
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]) {
                    t[i] = Math.max(t[i], t[j] + 1);
                    maxLIS = Math.max(maxLIS, t[i]);
                }
            }
        }

        return maxLIS;
    }
}


//Approacj-3 (Using concept of Patience Sorting (O(nlogn))
//T.C : O(nlogn)
//S.C : O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            /*
                Why lower bound?
                We want an increasing subsequence, and hence
                we want to eliminate the duplicates as well.
                lower_bound returns the index of "next greater or equal to."
            */
            int index = binarySearch(sorted, nums[i]);

            if (index == sorted.size())
                sorted.add(nums[i]); // greatest: so insert it
            else
                sorted.set(index, nums[i]); // replace
        }

        return sorted.size();
    }

    private int binarySearch(List<Integer> sorted, int target) {
        int left = 0, right = sorted.size();
        int result = sorted.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (sorted.get(mid) < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid;
            }
        }
        return result;
    }
}

	
//Approach-4 (Using same code of Leetcode-2926(Maximum Balanced Subsequence Sum) (YouTube - https://www.youtube.com/watch?v=JrG4tbq6efg)
//T.C : O(nlogn)
//S.C : O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int len = 1;

            Integer key = mp.lowerKey(nums[i]);
            if (key != null) {
                len += mp.get(key);
            }

            mp.put(nums[i], Math.max(mp.getOrDefault(nums[i], 0), len));

            key = mp.higherKey(nums[i]);
            while (key != null && mp.get(key) <= len) {
                mp.remove(key);
                key = mp.higherKey(nums[i]);
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}