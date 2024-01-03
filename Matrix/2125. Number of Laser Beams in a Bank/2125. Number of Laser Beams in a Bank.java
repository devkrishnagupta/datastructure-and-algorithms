class Solution {
    public static int numberOfBeams(String[] bank) {
        int n = bank.length;

        int prevDeviceCount = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {

            int currDeviceCount = 0;
            for (char ch : bank[i].toCharArray()) {
                if (ch == '1') {
                    currDeviceCount++;
                }
            }

            result += (prevDeviceCount * currDeviceCount);

            prevDeviceCount = (currDeviceCount == 0) ? prevDeviceCount : currDeviceCount;
        }

        return result;
    }
    public static void main(String[] args) {
        String[] testCase1 = {"011001","000000","010100","001000"};
        String[] testCase2 = {"000","111","000"};
        int res1 = numberOfBeams(testCase1);
        System.out.println(res1);
        int res2 = numberOfBeams(testCase2);
        System.out.println(res2);
    }
}