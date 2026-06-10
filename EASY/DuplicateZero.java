public class DuplicateZero {

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        int index = 0;

        for (int i = 0; i < n && index < n; i++) {
            if (arr[i] == 0) {
                a[index++] = 0;

                if (index < n) {
                    a[index++] = 0;
                }
            } else {
                a[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }

    public static void main(String[] args) {
        DuplicateZero obj = new DuplicateZero();

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        obj.duplicateZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}