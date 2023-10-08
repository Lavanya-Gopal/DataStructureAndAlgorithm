import java.util.Scanner;

public class GcdOfTwoNumbers {
    static int EuclidAlgo(int num1, int num2) {
        int gcd = 0;
        while (num1 != num2) {
            if (num1 > num2) {
                gcd = num1 - num2;
                num1 = gcd;

            } else {
                gcd = num2 - num1;
                num2 = gcd;

            }

        }
        return gcd;

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(EuclidAlgo(a, b));

    }

}