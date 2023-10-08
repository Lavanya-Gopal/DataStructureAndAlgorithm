import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();

        for (int i = 0; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        s.close();
    }

    public static Boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 3; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
