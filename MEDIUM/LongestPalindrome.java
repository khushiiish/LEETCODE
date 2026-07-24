public class LongestPalindrome {

    int start = 0;
    int maxLength = 1;

    private void expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }

            left--;
            right++;
        }
    }

    public String longestPalindrome(String s) {

        if (s.length() == 0)
            return "";

        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);      // Odd-length palindrome
            expand(s, i, i + 1);  // Even-length palindrome
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();

        String s = "babad";
        System.out.println("Longest Palindrome: " + obj.longestPalindrome(s));
    }
}