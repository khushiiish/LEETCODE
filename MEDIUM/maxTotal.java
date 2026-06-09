public class maxTotal {

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        long diff = max - min;
        long ans = diff * k;

        return ans;
    }

    public static void main(String[] args) {
        maxTotal obj = new maxTotal();

        int[] nums = {1, 3, 7, 2};
        int k = 3;

        System.out.println(obj.maxTotalValue(nums, k));
    }
}