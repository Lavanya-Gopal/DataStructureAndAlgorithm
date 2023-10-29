package StairCaseDetail;

public class StaircaseDetail {

    public static void main(String[] args) {
        int n = 6;
        staircase(n);

    }

    public static void staircase(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=n; j++) {
              
                if (j>=(n - i)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

}
