
import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        // k = 1 hone par difference hamesha 0 hoga
        if (k == 1) {
            return 0;
        }

        // Array sort karke har consecutive group of size k check karte hain
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        /*
         * nums[i] -> group ka smallest element
         * nums[i + k - 1] -> group ka largest element
         * Difference nikal kar minimum difference store karte hain
         */
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}