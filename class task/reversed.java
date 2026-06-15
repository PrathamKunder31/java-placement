import java.util.Scanner;

public class reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            StringBuilder rev = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                rev.append(word.charAt(i));
            }
            result.append(rev);
            if (w < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Reversed words: " + result.toString());
        sc.close();
    }
}      