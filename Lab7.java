import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1, b = 1, c;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(a + " ");
                    c = a + b;
                    a = b;
                    b = c;
                }
            System.out.println();
        }
    }
}