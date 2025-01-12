import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.RowFilter.Entry;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{1, 10}, {1,3},{2,4},{6,8},{9,10}};

        Arrays.sort(arr, new Comparator<int[]>() {
            
            @Override
            public int compare(int[] a, int[] b){
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
        Arrays.stream(arr).forEach(a -> {
            System.out.println(Arrays.toString(a));
        });
        List<int[]> ans = new ArrayList<>();
        for(int[] a: arr){
            if (ans.isEmpty()) {
                ans.add(a);
            }else if(ans.get(ans.size() - 1)[1]>= a[0]){
                ans.get(ans.size() - 1)[1] = a[1];
            }else{
                ans.add(a);
            }
        }
    }
}