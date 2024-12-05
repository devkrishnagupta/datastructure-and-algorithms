import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.RowFilter.Entry;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(4);
        pq.add(5);
        pq.add(3);
        pq.add(10);
        System.out.println(pq.peek());
    }

    
}