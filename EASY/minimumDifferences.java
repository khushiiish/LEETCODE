import java.util.Arrays;

public class minimumDifferences {

    public int minimumDifference(int[] nums, int k) {

        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {

        minimumDifferences obj = new minimumDifferences();

        int[] nums = {9, 4, 1, 7};
        int k = 2;

        System.out.println(obj.minimumDifference(nums, k));
    }
}