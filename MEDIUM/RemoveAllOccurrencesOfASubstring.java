public class RemoveAllOccurrencesOfASubstring {

    // Approach 1: Using contains() and replaceFirst()
    public String removeOccurrences1(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    // Approach 2: Using StringBuilder (more efficient)
    public String removeOccurrences2(String s, String part) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));

            if (sb.length() >= part.length()) {
                int start = sb.length() - part.length();

                if (sb.substring(start).equals(part)) {
                    sb.delete(start, sb.length());
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveAllOccurrencesOfASubstring sol =
                new RemoveAllOccurrencesOfASubstring();

        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println("Approach 1: " +
                sol.removeOccurrences1(s, part));

        System.out.println("Approach 2: " +
                sol.removeOccurrences2(s, part));
    }
}