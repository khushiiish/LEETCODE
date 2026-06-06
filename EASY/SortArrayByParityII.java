import java.util.Arrays;

public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {
        int[] a = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                a[even] = nums[i];
                even += 2;
            } else {
                a[odd] = nums[i];
                odd += 2;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};

        int[] result = sortArrayByParityII(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}