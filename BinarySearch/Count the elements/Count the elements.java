//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String line2 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    String[] b1 = line2.trim().split("\\s+");
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		        b[i]=Integer.parseInt(b1[i]);
		    }
		    int q = Integer.parseInt(br.readLine());
		    int query[]=new int[q];
		    for(int i=0;i<q;i++)
		    {
		        query[i]=Integer.parseInt(br.readLine());
		    }
		    Solution ob=new Solution();
		    int ans[]=ob.countElements(a,b,n,query,q);
		    for(int i=0;i<q;i++)
		    System.out.println(ans[i]);
		    
		}
	}
}

// } Driver Code Ends


//User function Template for Java

// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(n) ~ for storing ans
class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < q; i++){
            int qIndex = query[i];
            int el = a[qIndex];
            int count = 0;
            for(int j = 0; j < n; j++){
                if(el >= b[j]){
                    count++;
                }
            }
            list.add(count);
        }
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int val: list){
            ans[idx++] = val;
        }
        return ans;
    }
}

// Approach-1 (Binary Search)
// T.C : O(n * logN)
// S.C : O(n) ~ for storing ans
class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < q; i++){
            int qIndex = query[i];
            int el = a[qIndex];
            Arrays.sort(b);
            list.add(countElementsLessThanTarget(b, el));
        }
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int val: list){
            ans[idx++] = val;
        }
        return ans;
    }
    
    // Binary search to count the number of elements less than a number in sorted array
    public static int countElementsLessThanTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        // Initialize the result variable to -1
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If the mid element is less than the target, update the result and move to the right
            if (arr[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else { // If the mid element is greater than or equal to the target, move to the left
                right = mid - 1;
            }
        }
        
        // If the target is greater than all elements in the array, result will be the last index of the array
        // Otherwise, result will be the index of the last element less than the target
        return result + 1;
    }
}
