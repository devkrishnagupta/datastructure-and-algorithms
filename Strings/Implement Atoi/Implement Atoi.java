//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */

// Approach-1
// T.C : O(|s|)
// S.C : O(1)
class Solution
{
    int atoi(String s) {
	    // Your code here
	    
	    int n = s.length(), ans = 0;
	    boolean isNeg = false;
	    
	    if(s.charAt(0) == '-'){
	        isNeg = true;
	    }else{
	        ans = s.charAt(0) - '0';
	    }
	    
	    for(int i = 1; i < n; i++){
	        char ch = s.charAt(i);
	        if(ch >= '0' && ch <= '9'){
	            ans = (10 * ans) + (int) (ch - '0');
	        }else{
	            return -1;
	        }
	    }
	    
	    return isNeg ? ans * -1 : ans;
    }
}
