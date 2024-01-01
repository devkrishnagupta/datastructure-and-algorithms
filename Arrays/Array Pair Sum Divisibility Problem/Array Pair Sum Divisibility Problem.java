//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

//Approach-1 (Using Brute Force, checking every pair sum either divisible or not)
//Time => O(N*N)
//Space => O(N) ->  `usedPair`
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int len=nums.length;
        if(len%2!=0)return false;
        boolean[] usedPair = new boolean[len];
        for(int i=0;i<len-1;i++){
            if(usedPair[i]==true)continue;
            for(int j=i+1;j<len;j++){
                if(usedPair[j]==true)continue;
                if((nums[i]+nums[j])%k==0){
                    usedPair[i]=true;
                    usedPair[j]=true;
                    break;
                }
            }
            if(usedPair[i]==false)
                return false;
        }
        return true;
    }
}

//Approach-2 (Using Brute Force, checking every pair sum either divisible or not)
//Time => O(N*N)
//Space => 1
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int len=nums.length;
        if(len%2!=0)return false;
        for(int i=0;i<len-1;i++){
            if(nums[i]==-1)continue;
            for(int j=i+1;j<len;j++){
                if(nums[j]==-1)continue;
                if((nums[i]+nums[j])%k==0){
                    nums[i]=-1;
                    nums[j]=-1;
                    break;
                }
            }
            if(nums[i]!=-1)
                return false;
        }
        return true;
    }
}


//Approach-3 Based on Mathematical formula if(a+b)%k==0 (means a+b is divisible by k) then r1+r2=k, where r1=a%k and r2=b%k
//
//Time => O(N)
//Space => O(N)
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int len=nums.length;
        if(len%2!=0)return false;
        HashSet<Integer> set = new HashSet<>(); 
        for(int i=0;i<len;i++){
            int r1 = nums[i]%k;
            int r2 = k-r1;
            if(set.contains(r2)){
                set.remove(Integer.valueOf(r2));
            }else if(r1==0 && set.contains(0)){
                set.remove(Integer.valueOf(0));
            }else{
                set.add(r1);
            }
        }
        return set.size()==0;
    }
}