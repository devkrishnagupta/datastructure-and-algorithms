//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends

//Approach-1 (Brute force)
//Time => o(N)*o(N)
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==s){
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}

//Approach-2
//Time => n
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0,start=0,end=0;
        while(s!= 0 && start<n && end<n){
            if(sum<s)
                sum+=arr[end];
            else if(sum>s){
                sum-=arr[start];
                start++;
            }
            if(sum==s){
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
            if(sum<s){
                end++;
            }
        }
        ans.add(-1);
        return ans;
    }
}