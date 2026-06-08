public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        long sum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            if (right - left + 1 == k) {

                maxSum = Math.max(maxSum, sum);

                sum -= nums[left];
                left++;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = obj.findMaxAverage(nums, k);

        System.out.printf("%.5f%n", result);
    }
}