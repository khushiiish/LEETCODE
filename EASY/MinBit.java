public class MinBit {

    public static int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;

        int result = minBitFlips(start, goal);
        System.out.println("Minimum Bit Flips: " + result);
    }
}