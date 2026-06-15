import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                int sq = num * num;
                if (num % 2 == 0) 
                System.out.print("-"+sq+"");
                else
                System.out.print(sq+"");    
                num++;
            }
            System.out.println();
        }
    }
}
