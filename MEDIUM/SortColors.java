import java.util.Arrays;

public class SortColors {

    // Brute Force Approach
    public void sortColorsBrute(int[] nums) {
        Arrays.sort(nums);
    }

    // Better Approach (Counting Sort)
    public void sortColorsBetter(int[] nums) {
        int n = nums.length;
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }

        int idx = 0;

        for (int i = 0; i < count0; i++)
            nums[idx++] = 0;

        for (int i = 0; i < count1; i++)
            nums[idx++] = 1;

        for (int i = 0; i < count2; i++)
            nums[idx++] = 2;
    }

    // Optimal Approach (Dutch National Flag Algorithm)
    public void sortColorsOptimal(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] arr = {2, 0, 2, 1, 1, 0};

        sc.sortColorsOptimal(arr);

        System.out.println(Arrays.toString(arr));
    }
}