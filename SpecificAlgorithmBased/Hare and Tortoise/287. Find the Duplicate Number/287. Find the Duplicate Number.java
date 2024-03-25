// Approach-1 (Two loop check for every element of one to another)
// T.C : O(n * n)
// S.C : O(1)

// Approach-2 (Sorting and check consecutive)
// T.C : O(n * logN)
// S.C : O(1)


// Approach-3 (HashMap sore and check the frequency is more than one of a particular element)
// T.C : O(n)
// S.C : O(n)

// Approach-4 (Modifying the original Array)
//(Go to element index & make them negative element if element is already negative then that mesan duplicate lement)
// T.C : O(n)
// S.C : O(1)

// Approach-5 (Hare and Tortoise     ~   Two pointer approach)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}