class Solution {
    
    public int[] findErrorNums(int[] nums) {
        
        int x[] = new int[nums.length+1];
        
        for(int i: nums)
            x[i]++;
        
        int dup=0,mis=0;
        
        for(int i=1; i<x.length; i++){
            if(x[i] == 2)dup=i;
            if(x[i] == 0)mis=i;
        }
        
        return new int[] {dup, mis};
    }
}