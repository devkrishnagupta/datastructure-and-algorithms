//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

//Approach-1 (Using sorting)
//Time n*log(n)
//space 1
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        Arrays.sort(nums);
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int index=0;
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                ans[index++]=nums[i];
            }else{
                i++;
            }
        }
        if(ans[1]==-1)
            ans[1]=nums[nums.length-1];
        if(ans[0]>ans[1]){
            int temp=ans[0];
            ans[0]=ans[1];
            ans[1]=temp;
        }
        return ans;
    }
}

//Approach-2 (Using HashMap)
//Time n
//Space n
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int x: nums)
            map.put(x, map.getOrDefault(x, 0)+1);
        int[] ans=new int[2];
        int index=0;
        for(int x: nums){
            if(map.get(x)==1){
                ans[index++]=x;
            }
        }
        if(ans[0]>ans[1]){
            int temp=ans[0];
            ans[0]=ans[1];
            ans[1]=temp;
        }
        return ans;
    }
}

//Approach-3
