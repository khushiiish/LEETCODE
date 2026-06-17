import java.util.Arrays;

public class MostFreqElement {

    public static int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);

        int ans = -1;
        int maxFreq = 0;
        int count = 1;

        for (int i = 1; i <= nums.length; i++) {

            if (i < nums.length && nums[i] == nums[i - 1]) {
                count++;
            } else {
                int num = nums[i - 1];

                if (num % 2 == 0) {
                    if (count > maxFreq) {
                        maxFreq = count;
                        ans = num;
                    }
                }

                count = 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 4, 4, 1};

        int result = mostFrequentEven(nums);

        System.out.println("Most Frequent Even Element: " + result);
    }
}