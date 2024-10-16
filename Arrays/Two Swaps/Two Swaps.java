// Approach-1
// T.C : O()
// S.C : O()
class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int n = arr.size();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) != i + 1){
               int temp = arr.get(arr.get(i) - 1);
               arr.set(arr.get(i) - 1, arr.get(i));
               arr.set(i, temp);
               count++; 
            }
            
            if(count >= 2){
                break;
            }
        }
        if(count != 2 && count != 0){
            return false;
        }
        for(int i = 0; i < n; i++){
            if(arr.get(i) != i + 1){
                return false;
            }
        }
        
        return true;
    }
}

// Approach-1
// T.C : O()
// S.C : O()
class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=i+1){
                int temp = arr.get(i);
                arr.set(i,arr.get(arr.get(i)-1));
                arr.set(temp-1,temp);
                i--;
                count++;
            }
            if(count>2)return false;
        }
        return count==2|count==0;
    }
}