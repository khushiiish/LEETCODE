import java.util.Arrays;

public class LeftRightDifference {

    // Brute Force Method
    public static int[] leftRightDifferenceBrute(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            ans[i] = Math.abs(leftSum - rightSum);
        }

        return ans;
    }

    // Prefix Sum Method
    public static int[] leftRightDifferencePrefix(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};

        int[] bruteResult = leftRightDifferenceBrute(nums);
        int[] prefixResult = leftRightDifferencePrefix(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Brute Force Output: " + Arrays.toString(bruteResult));
        System.out.println("Prefix Sum Output: " + Arrays.toString(prefixResult));
    }
}