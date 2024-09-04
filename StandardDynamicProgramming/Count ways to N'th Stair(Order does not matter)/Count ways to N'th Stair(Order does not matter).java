// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    public int nthStair(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,1);
        for(int i=2;i<=n;i++){
            arr[i] += arr[i-2];
        }
        return arr[n];
    }
}

// Approach-1
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int nthStair(int n) {
        int pp=1, p=1;
        for(int i=2;i<=n;i++){
            int cur = 1 + pp;
            pp = p;
            p = cur;
        }
        return p;
    }
}

// Approach-1
// T.C : O(1)
// S.C : O(1)
class Solution {
    public int nthStair(int n) {
        return n/2 + 1;
    }
}