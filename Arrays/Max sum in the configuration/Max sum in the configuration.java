// Approach-1 Brute Forece
// T.C : O(n * n)
// S.C : O(1)
class Solution {
    long max_sum(int a[], int n) {
        // Your code here
        long max_sum = 0;
        for(int i = 0; i < n; i++){
            long curr_sum = 0;
            for(int j = 0; j < n; j++){
                curr_sum += a[j] * ((i + j) % n);
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        
        return max_sum;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    long max_sum(int arr[], int n) {
        // Your code here
        long sum=0;
        long prev_sum=0;
        for(int i=0; i<n; i++){
            prev_sum +=  (long)i*arr[i];
            sum+=arr[i];
        }
        long ans=prev_sum;
        
        for(int i=1; i<n; i++){
            long curr_sum = prev_sum - (sum -arr[i-1]) + (long)arr[i-1]*(n-1);
            
            prev_sum = curr_sum;
          if(curr_sum > ans) ans = curr_sum;
        }
        return ans;
    }
}