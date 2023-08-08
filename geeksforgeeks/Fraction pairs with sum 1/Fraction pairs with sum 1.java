//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] numerator = IntArray.input(br, n);
            
            
            int[] denominator = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countFractions(n, numerator, denominator);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


//Approach-1
class Solution {
    public static int countFractions(int n, int[] num, int[] denom) {
       int ans=0;
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=num[i],y=denom[i];
            int g=gcd(x,y);
            x/=g;  y/=g;
           
           int n_x = y-x; int n_y=y;
           //checking if 1-x/y is present in map - if yes -incerement the cnt;
            if(map.containsKey(n_x) && map.get(n_x).containsKey(y)){
                ans+=map.get(n_x).get(y);
            }
            //checking if some fractions have same num - push the denom in value(itself map)
            if(map.containsKey(x)){
                HashMap<Integer,Integer> hm =map.get(x);
                hm.put(y,hm.getOrDefault(y,0)+1);
                
            }
            //new fraction coming up.
            else{
                HashMap<Integer,Integer> hm=new HashMap<>();
                hm.put(y,1);
                map.put(x,hm);
            }
        }
        return ans;
    }
     static int gcd(int a,int b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}


//Approach-2 (Brute forece) Time Complexity=> O(n)*O(n)
class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        //brute forece
        int ans=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(((float)numerator[i])/denominator[i] + ((float)numerator[j])/denominator[j] == 1.0f)
                    ans++;
            }
        }        
        return ans;
        
    }
}

//Approach-3 (using binary search) (It's not working because of fraction sum)
class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        //brute forece
        int ans=0;
        float[] ratio=new float[n];
        for(int i=0;i<n;i++){
            ratio[i]=((float)numerator[i])/denominator[i];
        }
        Arrays.sort(ratio);
        for(int i=0;i<n-1;i++){
            if(bs(ratio, ratio[i], i+1, n-1))
                ans++;
        }
        return ans;
    }
    
    public static boolean bs(float[] ratio, float x, int i, int j){
        if(i>=j)
            return x+ratio[i]==1.0f;
        int mid=(i+j)/2;
        if(ratio[mid]+x==1.0f)
            return true;
        else if(ratio[mid]+x>1.0f)
            return bs(ratio, x, i, mid-1);
        else{
            return bs(ratio, x, mid+1, j);
        }
    }
}
     