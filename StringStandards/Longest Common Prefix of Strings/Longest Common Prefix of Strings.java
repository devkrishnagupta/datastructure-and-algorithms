// Approach-1 (Brute Force)
// T.C : O()
// S.C : O()

// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String temp = arr[0];
        int i=0,j=0;
        while(i<temp.length()){
            for(j=0;j<arr.length;j++){
                if(temp.charAt(i)!=arr[j].charAt(i))break;
            }
            if(j!=arr.length)break;
            i++;
        }
        if(i==0)return "-1";
        return temp.substring(0,i);
        
    }
}