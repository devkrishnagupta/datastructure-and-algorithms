// Approach-1 (Brute forece, checking every digit from low to high)
// T.C : O(high - low) * 10     ~    O(high)
// S.C : O(1)
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = low; i <= high; i++){
            if(isSeq(i))
                ans.add(i);
        }
        
        return ans;
    }
    
    public boolean isSeq(int digit){
        while(digit > 9){
            int second = digit % 10;
            digit /=10;
            int first = digit % 10;
            if(first + 1 != second){
                return false;
            }
        }
        return true;
    }
}

// Approach - 2 (Using Recursion)
// T.C : O(N)  Where N is possible digit that satisfy the condition
// S.C : O(N)  Where N is possible digit that satisfy the condition
class Solution {
    
    List<Integer> ans;
    int high, low;
    
    public List<Integer> sequentialDigits(int low, int high) {
        
        ans = new ArrayList<>();
        this.high = high;
        this.low = low;
        
        for(int i = 1; i <= 9; i++){
            solve(i);
        }
        Collections.sort(ans);
        return ans;
    }
    
    public void solve(int digit){
        if(digit > high){
            return;
        }
        if(digit >= low){
            ans.add(digit);
        }
        
        int lastDigit = digit % 10;
        if(lastDigit != 9)
            solve(digit * 10 + (lastDigit + 1));
    }
}

// Approach-3 (BFS like approach for traversing one increment of last digit)
// T.C : O(N) Where N is possible digit that satisfy the condition
// S.C : O(N) Where N is possible digit that satisfy the condition
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= 9; i++){
            q.add(i);
        }
        
        while(!q.isEmpty()){
            int temp = q.remove();
            
            if(temp >= low && temp <= high){
                ans.add(temp);
            }
            
            int last = temp % 10;
            if(last + 1 <= 9){
                q.add(temp * 10 + (last + 1)); // temp = 12 --> 123
            }
        }
        
        return ans;
    }
}

// Approach-4 (Make the posibble sequentials numbers and search with in the range)
// T.C : O(1)
// S.C : O(1)
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        int[] allPossible = {
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            12, 23, 34, 45, 56, 67, 78, 89,
            123, 234, 345, 456, 567, 678, 789,
            1234, 2345, 3456, 4567, 5678, 6789,
            12345, 23456, 34567, 45678, 56789,
            123456, 234567, 345678, 456789,
            1234567, 2345678, 3456789,
            12345678, 23456789,
            123456789
        };
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < allPossible.length; i++){
            if(allPossible[i] < low)
                continue;
            if(allPossible[i] > high)
                break;
            ans.add(allPossible[i]);
        }
        
        return ans;
    }
}