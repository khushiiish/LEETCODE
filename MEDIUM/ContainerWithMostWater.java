public class ContainerWithMostWater {

    // Brute Force Approach - O(n²)
    public static int maxAreaBrute(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int currWater = width * h;

                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    // Optimal Two-Pointer Approach - O(n)
    public static int maxAreaOptimal(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Brute Force Answer: " + maxAreaBrute(height));
        System.out.println("Optimal Answer: " + maxAreaOptimal(height));
    }
}