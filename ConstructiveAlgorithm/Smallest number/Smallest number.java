// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        int min = (int) Math.pow(10, d-1);
        int max = ((int) Math.pow(10, d + 1) ) - 1;

        for(int i = min; i <= max; i++){
            int[] res = digitOpr(i);
            if(res[0] == s && res[1] == d){
                return "" + i;
            }
        }
        
        return "-1";
    }
    
    int[] digitOpr(int i){
        int count  = 0;
        int sum = 0;
        
        while(i > 0){
            count++;
            sum += i % 10;
            i /= 10;
        }
        
        return new int[]{sum, count};
    }
}

// Approach-1
// T.C : O(d)
// S.C : O(1)
class Solution2 {
    public String smallestNumber(int s, int d) {
        // code here
        StringBuilder ans = new StringBuilder();
        int i=1;
        while(i<=d){
            int num = s-(d-i)*9<=0?0:s-(d-i)*9;
            if(num>9)return "-1";
            if(i==1 && num==0)num=1;
            ans.append((char)(num+'0'));
            s-=num;
            i++;
        }
        return ans.toString();
    }
}