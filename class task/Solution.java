import java.util.Scanner;
class Solution {
    public static void main(String []args){
        System.out.println("Enter the no of row:  ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int numRows = Integer.parseInt(n);
        for(int i=1;i<=numRows;i++)
            {  
            for(int j=1;j<=numRows;j++)
            {
                System.out.print("");
            }
            System.out.println();
        }
        sc.close();
    
    }
}



/*1
import java.util.Scanner;
class Solution {
    public static void main(String []args){
        System.out.println("Enter the no of row:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            {  
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    
    }
}*/




/*4
import java.util.Scanner;
class Solution {
    public static void main(String []args){
        System.out.println("pattern printing");
        System.out.println("Enter the number of * in the row:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }       
            System.out.println();
        }
        sc.close();
    
    }
}
*/







/*14
import java.util.Scanner;
class Solution {
    public static void main(String []args){
        System.out.println("pattern printing");
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    
    }
}*/