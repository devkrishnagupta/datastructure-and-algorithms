import java.util.ArrayList;

public class Solution {
    boolean canPut(int row,int col,ArrayList<Integer> temp){
        int r = row, c= col;
        while(r>=0 && c>=0){
            if(temp.get(r)==c+1)return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while(r>=0){
            if(temp.get(r)==c+1)return false;
            r--;
        }
        r = row;
        c = col;
        while(r>=0 && c<temp.size()){
            if(temp.get(r)==c+1)return false;
            r--;
            c++;
        }
        return true;
    }
    void help(int n,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp,int row){
        if(row==n){
            ans.add(temp);
            return;
        }
        for(int col=0;col<n;col++){
            if(canPut(row,col,temp)){
                temp.set(row,col+1);
                ArrayList tempCopy = new ArrayList(temp);
                help(n,ans,tempCopy,row+1);
                temp.set(row,0);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++)temp.add(0);
        help(n,ans,temp,0);
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<ArrayList<Integer>> ans = s.nQueen(4);
        System.out.println(ans);
    }
}
