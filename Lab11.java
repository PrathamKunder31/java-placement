import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int term = 1;

        for (int i = 1; i <= n; i++) {
            if(i%2==0)
            System.out.print(-term + " ");
            else
            System.out.print(term+ " ");
        term += 4;
            }
        }
    }
