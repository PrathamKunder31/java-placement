import java.util.*;

public class main {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        double trainee1=0;
        double trainee2=0;
        double trainee3=0;

        int n = sc.nextInt();  

        List<List<Integer>> outerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> innerList = new ArrayList<>();

            for (int j = 0; j < 3; j++) {

                int data = sc.nextInt();

                if (data >= 1 && data <= 100) {
                    innerList.add(data);
                } else {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }

            outerList.add(innerList);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += outerList.get(j).get(i);
            }

            result.add(Math.round((float) sum / n));
        }

        int max = Collections.max(result);

        if (max < 70) {
            System.out.println("All trainees are unfit");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (result.get(i) == max) {
                System.out.println("Trainee Number : " + (i + 1));
            }
        }

        sc.close();
    }
}