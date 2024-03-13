// Approach-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(1)
class Solution {
    public int pivotInteger(int n) {
        if (n == 1)
            return 1;

        for (int pivot = 1; pivot <= n; pivot++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 1; j <= pivot; j++) {
                leftSum += j;
            }

            for (int j = pivot; j <= n; j++) {
                rightSum += j;
            }

            if (leftSum == rightSum) {
                return pivot;
            }
        }

        return -1;
    }
}

// Approach-1 (Two Pointer)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int pivotInteger(int n) {
        int i = 1;
        int j = n;
        
        int leftSum  = 0;
        int rightSum = 0;
        
        do{
            if(leftSum == rightSum && i == j){
                return i;
            }
            if(leftSum < rightSum)
                leftSum += i++;
             else
                rightSum += j--;
        }while( i <= j);
        
        return -1;
    }
}

// Approach-1 (Sum of N natural numbers)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int pivotInteger(int n) {
        
        int leftSum  = 0;
        int rightSum = 0;
        
        int ts = (n * (n + 1)) / 2;
        
        for(int i = 1; i <= n; i++){
            int ls = (i * (i + 1)) / 2;
            int rs = ts - ls + i;
            if(ls == rs)
                return i;
        }
        
        return -1;
    }
}

// Approach-4 (Using Binary Search)
// T.C: log(n)
// S.C: O(1)
class Solution {
    public int pivotInteger(int n) {
        if (n == 1)
            return 1;

        int totalSum = n * (n + 1) / 2;

        int left = 1, right = n;

        while (left <= right) {
            int midPivot = left + (right - left) / 2;

            if (midPivot * midPivot == totalSum) {
                return midPivot;
            } else if (midPivot * midPivot < totalSum) {
                left = midPivot + 1;
            } else {
                right = midPivot - 1;
            }
        }

        return -1;
    }
}

// Approach-5 (Using Quick Math)
// T.C: O(1)
// S.C: O(1)
class Solution {
    public int pivotInteger(int n) {
        if (n == 1)
            return 1;

        int totalSum = n * (n + 1) / 2;

        int pivot = (int) Math.sqrt(totalSum);

        if (pivot * pivot == totalSum)
            return pivot;

        return -1;
    }
}