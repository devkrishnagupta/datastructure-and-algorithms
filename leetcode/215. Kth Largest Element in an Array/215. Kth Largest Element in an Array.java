//Approach-1 (Using sorting)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//Approach-2 (Using Heap Sort)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: nums){
            pq.add(x);
            if(pq.size()>k)
                pq.remove();
        }
        return pq.remove();
    }
}

//Approach-3 (Using Quick Select)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        k=n-k;
        int L=0;
        int R=n-1;
        int pivot_idx=0;
        while(true){
            pivot_idx=partition_algo(nums, L, R);
            if(pivot_idx == k)
                break;
            else if(pivot_idx > k)
                R=pivot_idx-1;
            else
                L=pivot_idx+1;
            
        }
        return nums[pivot_idx];
    }
    
    public int partition_algo(int[] nums, int L, int R){
        int pivot=nums[R];
        int i=L-1;
        for(int j=L;j<=R-1;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, R);
        return i+1;
    }
    
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

//Approach-3 (Using QuickSelect Algorithm
//Time complexity: O(n) on average, O(n2) in the worst case (See video above for explanation)
class Solution {
    
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public int partition_algo(int[] nums, int L, int R) {
        
        int P = nums[L];
        int i = L+1; //0
        int j = R; //0
        
        while(i <= j) {
            
            if(nums[i] < P && nums[j] > P) {
                swap(nums, i, j);
                i++;
                j--;
            }
            
            if(nums[i] >= P) {
                i++;
            }
            
            if(nums[j] <= P) {
                j--;
            }
            
        }
        
        swap(nums, L, j);
        return j; //P is at jth index
    }
    
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        
        int L = 0;
        int R = n-1;
        
        int pivot_idx = 0;
        
        //kth largest pivot element - nums[k-1] (descendinforder me partition karenge)
        
        while(true) {
            
            pivot_idx = partition_algo(nums, L, R);
            
            if(pivot_idx == k-1) {
                break;
            } else if(pivot_idx > k-1) { //2nd larget , 4th larget
                R = pivot_idx - 1;
            } else {
                L = pivot_idx + 1;
            }
            
        }
        
        
        return nums[pivot_idx];
    }
}