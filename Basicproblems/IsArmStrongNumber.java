import java.util.Scanner;

public class IsArmStrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();
            System.out.println(IsArmstrong(num));
        }

    }

    public static boolean IsArmstrong(int num) {
        int val = num;
        int lastdigit = 0;
        int sum = 0;
        while (num > 0) {
            lastdigit = num % 10;
            sum += GetPowerOFNum(lastdigit);
            num = num / 10;
        }
        if (sum == val) {
            return true;
        } else {
            return false;

        }
    }

    private static int GetPowerOFNum(int lastdigit) {
        return lastdigit * lastdigit * lastdigit;
    }

}
