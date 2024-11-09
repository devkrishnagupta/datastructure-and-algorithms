// Approach-1 (Brute Force)
// T.C : O()
// S.C : O()
class Solution {
    String minSum(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int idx = 0;
        while(idx < n){
            sb1.append(arr[idx++]);
            if(idx < n){
                sb2.append(arr[idx++]);
            }
        }
        
        return sum(sb1.reverse().toString(), sb2.reverse().toString());
    }
    
    public String sum(String s1, String s2){
        StringBuilder res = new StringBuilder();
        int c = 0;
        int idx1 = 0, idx2 = 0;
        
        while(idx1 < s1.length() && idx2 < s2.length()){
            int a = s1.charAt(idx1++) - '0';
            int b = s2.charAt(idx2++) - '0';
            int sum = a + b + c;
            c = sum / 10;
            res.append(sum % 10);
        }
        
        while(idx1 < s1.length()){
            int a = s1.charAt(idx1++) - '0';
            int sum = a + c;
            c = sum / 10;
            res.append(sum % 10);
        }
        
        while(idx2 < s2.length()){
            int b = s2.charAt(idx2++) - '0';
            int sum = b + c;
            c = sum / 10;
            res.append(sum % 10);
        }
        
        if(c != 0){
            res.append(c);
        }
        
        return res.reverse().toString().replaceFirst("^0+", "");
    }
}

// Approach-2(Optimised Solution of First)
// T.C : O()
// S.C : O()
class Solution {
    String minSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        // Distribute digits alternately between two numbers
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb1.append(arr[i]);
            } else {
                sb2.append(arr[i]);
            }
        }

        // Sum the two strings representing the numbers
        return sum(sb1.toString(), sb2.toString());
    }

    public String sum(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int idx1 = s1.length() - 1, idx2 = s2.length() - 1;
        
        // Sum the digits starting from the least significant
        while (idx1 >= 0 || idx2 >= 0 || carry != 0) {
            int a = (idx1 >= 0) ? s1.charAt(idx1--) - '0' : 0;
            int b = (idx2 >= 0) ? s2.charAt(idx2--) - '0' : 0;
            
            int sum = a + b + carry;
            carry = sum / 10;
            res.append(sum % 10);
        }

        // Remove leading zeros and return the result
        return res.reverse().toString().replaceFirst("^0+", ""); // Ensure no leading zeros
    }
}
