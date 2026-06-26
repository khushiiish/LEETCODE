import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // Brute Force Approach - O(n²)
    public static int[] productExceptSelfBrute(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }

            ans[i] = prod;
        }

        return ans;
    }

    // Optimal Approach - O(n)
    public static int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Prefix Product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Suffix Product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        System.out.println("Input Array:");
        System.out.println(Arrays.toString(nums));

        System.out.println("\nBrute Force Output:");
        System.out.println(Arrays.toString(productExceptSelfBrute(nums)));

        System.out.println("\nOptimal Output:");
        System.out.println(Arrays.toString(productExceptSelfOptimal(nums)));
    }
}