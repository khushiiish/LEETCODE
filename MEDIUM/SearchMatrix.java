public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int lo = 0;
        int hi = rows * cols - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int midR = mid / cols;
            int midC = mid % cols;

            if (matrix[midR][midC] == target)
                return true;
            else if (matrix[midR][midC] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        SearchMatrix obj = new SearchMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(obj.searchMatrix(matrix, target));
    }
}