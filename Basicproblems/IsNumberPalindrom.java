import java.util.Scanner;

public class IsNumberPalindrom {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();
            System.out.print(IsPalindrome(num));
        }
    }

    private static boolean IsPalindrome(int num) {
        int val = num;
        int last= 0;
        String revstr = "";
        while(val>0){
               last= val%10;
               revstr+=last;
               val/=10;
        }
      
        if(revstr.equals(String.valueOf(num))){
            return true;
        }
        return false;
       
    }

}
