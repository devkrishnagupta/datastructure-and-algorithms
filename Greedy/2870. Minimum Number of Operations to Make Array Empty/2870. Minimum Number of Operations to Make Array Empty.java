class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val: nums)
            map.put(val, map.getOrDefault(val, 0)+1);
        int result=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            if(freq==1)
                return -1;
            result += Math.ceil((double)freq/3);
        }
        return result;
    }
}