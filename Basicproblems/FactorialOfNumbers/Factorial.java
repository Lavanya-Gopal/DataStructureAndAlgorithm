package FactorialOfNumbers;

import java.util.Scanner;

public class Factorial {
    static long GetFactorial(long num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;

    }

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            long num = scan.nextInt();
            System.out.println(GetFactorial(num));
        }
    }
}
