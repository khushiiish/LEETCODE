import java.util.*;

public class SearchRotatedArray {

    public int search(int[] arr, int target) {
        int low = 0, hi = arr.length - 1;

        while (low <= hi) {
            int mid = low + (hi - low) / 2;

            if (arr[mid] == target)
                return mid;

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

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        SearchRotatedArray obj = new SearchRotatedArray();
        int result = obj.search(arr, target);

        System.out.println("Index = " + result);

        sc.close();
    }
}