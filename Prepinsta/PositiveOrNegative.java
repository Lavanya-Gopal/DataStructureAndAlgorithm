import java.util.*;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = s.nextInt();
        try{
          if (num == 0) {
            System.out.println("Number is zero");

        } else if (num < 0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is positive");

        }
    }
    catch(Exception e){
        System.out.println(e);

    }
        
        s.close();

    }
}