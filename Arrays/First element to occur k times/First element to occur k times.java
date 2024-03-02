//{ Driver Code Starts
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.*;
import java.lang.*;

public class GfG { 
    public static void main (String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
            
            Solution obj = new Solution();
            System.out.println(obj.firstElementKTime(n, k, arr));
        }
    }
}

// } Driver Code Ends

// Approach-1
// T.C : O(n)
// S.C : O(k)
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int val: a){
            map.put(val, map.getOrDefault(val, 0) + 1);
            
            if(map.get(val) == k)
                return val; 
        }
        
        return -1;
    }
}

// Approach-2
// T.C : O(n)
// S.C : O(200) ~ O(1)
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int[] freq = new int[2001];
        Arrays.fill(freq, -1);
        
        for(int val: a){
            freq[val]++;
            if(freq[val] == k-1)
                return val;
        }
        
        return -1;
    }
}

// Approach-3 (Stream)
// T.C : O(n)
// S.C : O(n)
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) {
        
        return Arrays.stream(a)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(entry -> entry.getValue() == k)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(-1);
    }
}