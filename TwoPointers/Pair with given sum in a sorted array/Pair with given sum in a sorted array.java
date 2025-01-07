// Approach-1(Brute Force)
// T.C : O(n * n)
// S.C : O(1)

// Approach-2(Using Frequency Map)
// T.C : O(n)
// S.C : O(n)

// Approach-3(Optimised)
// T.C : O()
// S.C : O()
class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int i=0,j=arr.length-1,ans=0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                if(arr[i]==arr[j]){
                    int temp = j-i;
                    ans+=(temp*(temp+1))/2;
                    break;
                }
                else{
                    int right=1,left=1;
                    while(i<j && arr[i]==arr[i+1]){
                        left++;
                        i++;
                    }
                    while(i<j && arr[j]==arr[j-1]){
                        right++;
                        j--;
                    }
                    ans+=(left*right);
                    i++;
                    j--;
                }
            }
            else if(sum<target)i++;
            else j--;
        }
        return ans;
    }
}