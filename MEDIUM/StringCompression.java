public class StringCompression {

    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[idx++] = ch;

            if (count > 1) {
                String str = String.valueOf(count);
                for (int j = 0; j < str.length(); j++) {
                    chars[idx++] = str.charAt(j);
                }
            }

            i--;
        }

        return idx;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int len = sc.compress(chars);

        System.out.println("Compressed Length: " + len);
        System.out.print("Compressed Array: ");

        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}