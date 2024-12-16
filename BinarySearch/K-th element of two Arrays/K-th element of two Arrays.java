// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length, m=b.length;
        if(n>m) return kthElement(b, a, k);
        
        int lo=Math.max(0, k-m), hi=Math.min(n, k);
        while(lo<=hi){
            int mid1=(lo+hi)/2;
            int mid2=k-mid1;
            
            int l1, r1, l2, r2;
            if(mid1==0){
                l1=Integer.MIN_VALUE;
            }
            else{
                l1=a[mid1-1];
            }
            
            if(mid1==n){
                r1=Integer.MAX_VALUE;
            }
            else{
                r1=a[mid1];
            }
            
            if(mid2==0){
                l2=Integer.MIN_VALUE;
            }
            else{
                l2=b[mid2-1];
            }
            
            if(mid2==m){
                r2=Integer.MAX_VALUE;
            }
            else{
                r2=b[mid2];
            }
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            
            if(l1>r2){
                hi=mid1-1;
            }
            else{
                lo=mid1+1;
            }
        }
        return 0;
        
    }
}