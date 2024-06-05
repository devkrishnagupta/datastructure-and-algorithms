// Approach-1 (BruteForce)
// T.C : O()
// S.C : O()
//TLE
class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        long sum_a = 0;
        long sum_b = 0;
        for(long val : a){
            sum_a += val;
        }
        for(long val: b){
            sum_b += val;
        }
        int i = 0;
        int j = 0;
        while( i < n && j < m){
            if(sum_a + b[j] - a[i] == sum_b + a[i] - b[j]){
                return 1;
            }else if(sum_a + b[j] - a[i] > sum_b + a[i] - b[j]){
                i++;
            }else{
                j++;
            }
        }
        
        return -1;
    }
}

// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long s1=0,s2=0;
        for(long x : a)
        s1+=x;
        for(long x: b)
        s2+=x;
        
        if((s1-s2)%2!=0)
        return -1;
        
        long temp = (s1-s2)/2;
        HashSet<Long> set = new HashSet<>();
        for(long x : a) set.add(x);
        
        for(int i=0; i<m; i++){
            long need = (temp)+b[i];
            
            if(set.contains(need))
            return 1;
        }
       
        return -1;
    }
}