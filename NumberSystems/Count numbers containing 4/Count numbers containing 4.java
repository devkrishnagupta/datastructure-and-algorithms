// Approach-1 (Using Remainder theorem)
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            int num = i;
            while(num > 0){
                if(num % 10 == 4){
                    count++;
                    break;
                }
                num /= 10;
            }
        }
        
        return count;
    }
}

// Approach-1 (Using String)
// T.C : O(n * logN)
// S.C : O(1)
class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if (String.valueOf(i).contains("4")) {
                count++;
            }
        }
        
        return count;
    }
}