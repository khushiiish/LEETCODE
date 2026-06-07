import java.util.*;

public class FindRelativeRank {

    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        HashMap<Integer, String> map = new HashMap<>();

        int rank = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(rank));
            }

            rank++;
        }

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};

        FindRelativeRank obj = new FindRelativeRank();

        String[] result = obj.findRelativeRanks(score);

        System.out.println(Arrays.toString(result));
    }
}