import java.util.*;

public class peak {

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] &&
                mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        peak obj = new peak();

        int[] mountain = {2, 4, 4, 1};
        List<Integer> result = obj.findPeaks(mountain);

        System.out.println(result);
    }
}