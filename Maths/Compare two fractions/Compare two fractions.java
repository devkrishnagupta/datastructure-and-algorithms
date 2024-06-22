// Approach-1
// T.C : O(|str|)
// S.C : O(1)
class Solution {

    String compareFrac(String str) {
        // Split the input string into two fractions
        String[] arr = str.split(", ");
        
        // Split each fraction into numerator and denominator
        String[] arrA = arr[0].split("/");
        String[] arrB = arr[1].split("/");
        
        // Convert numerators and denominators to integers
        int numeratorA = Integer.parseInt(arrA[0]);
        int denominatorA = Integer.parseInt(arrA[1]);
        int numeratorB = Integer.parseInt(arrB[0]);
        int denominatorB = Integer.parseInt(arrB[1]);
        
        // Calculate the fractional values
        double a = (double) numeratorA / denominatorA;
        double b = (double) numeratorB / denominatorB;
        
        // Compare the two fractions
        int res = Double.compare(a, b);
        
        if (res == 0) {
            return "equal";
        } else {
            return res > 0 ? arr[0] : arr[1];
        }
    }
}