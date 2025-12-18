// Approach - 1
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    public void sortIt(int[] arr) {
        // code here
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> {
            if(a % 2 == 0 && b % 2 == 0){
                return a.compareTo(b);
            }else if(a % 2 != 0 && b % 2 != 0){
                return b.compareTo(a);
            }
            return a % 2 == 0 ? 1 : -1;
        });
        // opy values back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxed[i];
        }
    }
}
