public class SearchInSortedII {

    public boolean search(int[] arr, int target) {
        int low = 0, hi = arr.length - 1;

        while (low <= hi) {
            int mid = low + (hi - low) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // Handle duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[hi]) {
                low++;
                hi--;
                continue;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    hi = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[hi]) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SearchInSortedII obj = new SearchInSortedII();

        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean result = obj.search(arr, target);

        if (result) {
            System.out.println("Target found.");
        } else {
            System.out.println("Target not found.");
        }
    }
}