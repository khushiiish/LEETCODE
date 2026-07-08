public class DigitConcat {

    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        long concat = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '0') {
                continue;
            }

            int digit = ch - '0';
            concat = concat * 10 + digit;
            sum += digit;
        }

        return concat * sum;
    }

    public static void main(String[] args) {
        DigitConcat obj = new DigitConcat();
        System.out.println(obj.sumAndMultiply(10502)); // Output: 15012
    }
}