import java.util.Scanner;

public class GcdOfTwoNumberByGabriel {

    static int GudOfTwoNum(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
             if (num1 > num2) {
            num1 = num1 % num2;

        } else {
            num2 = num2 % num1;
        }

        }
        int res= Math.max(num1, num2);
        return res;
       
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(GudOfTwoNum(a,b));
    }
}