import java.util.Scanner;

public class ReverseWordinString {

    public static String reverseWords(String s) {
        String rev = "";
        String[] word = s.split(" ");

        for (int i = word.length - 1; i >= 0; i--) {
            if (!word[i].equals("")) {
                rev = rev + word[i] + " ";
            }
        }

        return rev.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed words: " + reverseWords(s));

        sc.close();
    }
}