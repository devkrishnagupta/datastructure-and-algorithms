// Approach-1
// T.C : O(logN)
// S.C : O(1)
class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n=arr.length,low=0,high=n-1,mid=0;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid]<=arr[high])high=mid;
            else low=mid+1;
        }
        return arr[low];
    }
}






















// User function Template for Java

class Solution {
    public int search(int[] A, int x) {

        // Complete this function
        
     int low = 0;
    int high = A.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(A[mid] ==x) return mid;
            
            if(A[low] == A[mid]) //handles duplicay or when low and mid at same point.
            low++;

            else if(A[low] <=A[mid])   // if left half sorted
            {
                if(x>=A[low] && x<A[mid] ) // checking if present in left sorted part
                high = mid-1;
                else
                low=mid+1;
            }
            
            else // if right half sorted A[low] >A[mid]
            {
                // checking if present in right half; 
                if(x>A[mid] && x<=A[high])  
                low=mid+1;
                
                else
                high = mid-1;
            }

        }
        return -1;
    }
}