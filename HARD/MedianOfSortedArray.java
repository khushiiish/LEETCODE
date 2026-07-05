public class MedianOfSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        // Find median
        if (total % 2 == 0) {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } else {
            return merged[total / 2];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median = " + median);
    }
}