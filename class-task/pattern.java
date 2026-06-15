public class pattern {
    public static void main(String[] args) {
        int n= 5; 

        for (char ch='A';ch<='E';ch ++) {
            System.out.println(ch);
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print(" ");
        }


        for (char ch=(char)('E'-1);ch>='A';ch --) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }