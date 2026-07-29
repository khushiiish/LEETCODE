import java.util.*;

class MaxProdBrute {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long product = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];
                ans = Math.max(ans, (int) product);
            }
        }

        return ans;
    }
}

class MaxProdPrefixSuffix {

    public int maxProduct(int[] nums) {
        int n = nums.length;

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (prefix == 0)
                prefix = 1;

            if (suffix == 0)
                suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }
}

public class MaxProd {

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        MaxProdBrute brute = new MaxProdBrute();
        MaxProdPrefixSuffix optimal = new MaxProdPrefixSuffix();

        System.out.println("Brute Force Answer: " + brute.maxProduct(nums));
        System.out.println("Prefix-Suffix Answer: " + optimal.maxProduct(nums));
    }
}