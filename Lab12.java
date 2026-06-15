import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        int whole = (int) num;
        double fraction = num - whole;

        System.out.println("Whole = " + whole);
        System.out.println("Fraction = " + fraction);
    }
}
