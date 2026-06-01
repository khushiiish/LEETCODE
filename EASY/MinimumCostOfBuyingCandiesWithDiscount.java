import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int sum = 0;

        for (int i = cost.length - 1; i >= 0; i -= 3) {
            sum += cost[i];

            if (i - 1 >= 0) {
                sum += cost[i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] cost = {1, 2, 3};

        MinimumCostOfBuyingCandiesWithDiscount obj =
            new MinimumCostOfBuyingCandiesWithDiscount();

        System.out.println(obj.minimumCost(cost));
    }
}