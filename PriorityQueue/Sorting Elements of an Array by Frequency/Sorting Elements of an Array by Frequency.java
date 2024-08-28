// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue to sort elements by frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    int freqCompare = frequencyMap.get(b) - frequencyMap.get(a);
                    if (freqCompare == 0) {
                        return a - b; // natural order for same frequency
                    }
                    return freqCompare; // descending order by frequency
                }
        );

        // Step 3: Add all elements to the PriorityQueue
        maxHeap.addAll(frequencyMap.keySet());

        // Step 4: Extract elements from PriorityQueue and form the result
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            int current = maxHeap.poll();
            int frequency = frequencyMap.get(current);
            for (int i = 0; i < frequency; i++) {
                sortedList.add(current);
            }
        }
        
        return sortedList;
    }
}

// Approach-2
// T.C : O()
// S.C : O()
// User function Template for Java



class Solution {

    // Function to sort the array according to frequency of elements.

    public ArrayList<Integer> sortByFreq(int arr[]) {

        // add your code here

        Map<Integer, Integer> map = new HashMap<>();

        for(int num: arr){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        ArrayList<Integer> sortedList = new ArrayList<>();

        for(int num: arr){

            sortedList.add(num);

        }

        sortedList.sort((a, b) -> {

            int freqA = map.get(a);

            int freqB = map.get(b);

            if(freqA == freqB){

                return a - b;

            }else{

                return freqB - freqA;

            }

        });

        return sortedList;

    }

}

