//Approach-1
class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;   
        }
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                if(set.contains(arr[i])){
                    while(set.contains(arr[i]) && arr[i]!=0){
                        ans++;
                        arr[i]--;
                    }
                    if(arr[i]!=0)
                        set.add(arr[i]);
                }else{
                    set.add(arr[i]);
                }
            }
        }
        return ans;
    }
}

//Approach-2
class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;   
        }
        int ans=0;
        Arrays.sort(arr);
        for(int i=24;i>=0;i--){
            if(arr[i]!=0 && arr[i]>=arr[i+1]){
                int prev=arr[i];
                arr[i]=Math.max(0, arr[i+1]-1);
                ans+=prev-arr[i];
            }
        }
        return ans;
    }
}