// Approach-1
// T.C : O()
// S.C : O()
// T.T.L
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum += sumOfFourDivisor(num);
        }
        return sum;
    }

    public int sumOfFourDivisor(int num){
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
                sum += i;
            }
        }
        return count == 4 ? sum : 0;
    }
}

// Approach-2
//T.C : O()
// S.C  :O()
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum += sumOfFourDivisor(num);
        }
        return sum;
    }

    public int sumOfFourDivisor(int num) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                int other = num / i;

                if (i == other) { // perfect square
                    count++;
                    sum += i;
                } else {
                    count += 2;
                    sum += i + other;
                }

                // Early exit if more than 4 divisors
                if (count > 4) {
                    return 0;
                }
            }
        }

        return count == 4 ? sum : 0;
    }

}