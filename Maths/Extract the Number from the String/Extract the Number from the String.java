// Approach-1
// T.C : O(n)
// S.C : O(n)
class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long ans = -1;
        String[] numbers = sentence.split(" ");
        for(String str: numbers){
            if(!str.contains("9")){
                try{
                    long num = Long.parseLong(str);
                    ans = Math.max(ans, num);
                }catch(Exception e){
                    
                }
            }
        }
        
        return ans;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(1)
class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long ans=0,temp=0;
        boolean indication=false;
        for(int i=0;i<sentence.length();i++){
            char x = sentence.charAt(i);
            if(x>='0' && x<='9'){
                if(x=='9')indication=true;
                temp=temp*10+(x-'0');
            }
            else if(x==' '){
                if(!indication)ans=Math.max(ans,temp);
                temp=0;
                indication=false;
            }
        }
        if(!indication)ans=Math.max(ans,temp);
        return ans==0?-1:ans;
    }
}