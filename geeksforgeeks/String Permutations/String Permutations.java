//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans=new ArrayList<>();
        int[] freq=new int[S.length()];
        help("", ans, freq, S);
        Collections.sort(ans);
        return ans;
    }
    
    public void help(String str, ArrayList<String> ans, int[] freq, String s){
        if(str.length()==s.length()){
            ans.add(str);
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            if(freq[i]==0){
                str=str+s.charAt(i);
                freq[i]=1;
                help(str, ans, freq, s);
                freq[i]=0;
                str=str.substring(0, str.length()-1);
            }
        }
    }
}
