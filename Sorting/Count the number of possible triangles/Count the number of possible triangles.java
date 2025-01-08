// Approach-1 (Brute Force)
// T.C : O()
// S.C : O()
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(isTriangle(arr, i, j, k)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    static boolean isTriangle(int[] arr, int i, int j, int k){
        return arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[k] + arr[i] > arr[j];
    }
}

// Approach-2
// T.C : O()
// S.C : O()
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length,ans=0;
        for(int i=n-1;i>=2;i--){
            int j=0,k=i-1;
            while(j<k){
                int twoSideSum=arr[j]+arr[k];
                if(twoSideSum>arr[i]){
                    ans+=k-j;
                    k--;
                }
                else j++;
            }
        }
        return ans;
    }
}
