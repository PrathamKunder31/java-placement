import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the age:");
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Age accepted.");
                break;  
            } else {
                System.out.println("Re-enter the age.");
            }
        }

        sc.close();
    }
}