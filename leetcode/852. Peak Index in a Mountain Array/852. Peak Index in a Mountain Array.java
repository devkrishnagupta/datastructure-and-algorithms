// First Approach
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return solve(arr, 0, arr.length-1);
    }
    
    public int solve(int[] arr, int i, int j){
        int mid=(i+j)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            return mid;
        if(arr[mid]>arr[mid-1])
            return solve(arr, mid, j);
        return solve(arr, i, mid);
    }
}

//Second Approach
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(arr[mid]<arr[mid+1])
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}