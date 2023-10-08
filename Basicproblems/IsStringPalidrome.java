import java.util.Scanner;

public class IsStringPalidrome {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(IsPalindrome(str));
            System.out.println(IsPalindromeUsingMethod(str));

        }
    }

    private static boolean IsPalindromeUsingMethod(String str) {
        StringBuilder temp = new StringBuilder(str);
        if (str.equals(temp.reverse().toString())) {
            return true;

        }

        return false;
    }

    private static boolean IsPalindrome(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }

}
