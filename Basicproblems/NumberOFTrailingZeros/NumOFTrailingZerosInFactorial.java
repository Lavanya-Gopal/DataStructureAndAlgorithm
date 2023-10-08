import java.util.Scanner;

public class NumOFTrailingZerosInFactorial {
    static int FindTrailingZeros(int n) {

        int powerof5 = 5;
        int res = 0;
        while (powerof5<= n) {
            res += (n / powerof5);
            powerof5 *= 5;

        }
        return res;

    }

    public static void main(String argsp[]) {
        System.out.println("Enter the Num");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();
            System.out.println(FindTrailingZeros(num));
        }

    }
}