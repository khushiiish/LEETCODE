import java.util.*;

public class MissingAndRepeated {

    // Brute Force Approach
    public static int[] findMissingAndRepeatedValuesBrute(int[][] grid) {
        int n = grid.length;
        int repeated = -1;
        int missing = -1;

        for (int num = 1; num <= n * n; num++) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == num) {
                        count++;
                    }
                }
            }

            if (count == 2) {
                repeated = num;
            } else if (count == 0) {
                missing = num;
            }
        }

        return new int[]{repeated, missing};
    }

    // HashSet + Sum Approach
    public static int[] findMissingAndRepeatedValuesOptimal(int[][] grid) {
        int n = grid.length;

        HashSet<Integer> set = new HashSet<>();
        int repeated = 0;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (set.contains(grid[i][j])) {
                    repeated = grid[i][j];
                }

                actualSum += grid[i][j];
                set.add(grid[i][j]);
            }
        }

        int expectedSum = (n * n) * (n * n + 1) / 2;
        int missing = expectedSum - actualSum + repeated;

        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        System.out.println(Arrays.toString(findMissingAndRepeatedValuesBrute(grid)));
        System.out.println(Arrays.toString(findMissingAndRepeatedValuesOptimal(grid)));
    }
}