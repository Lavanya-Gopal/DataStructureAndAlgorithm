import java.util.Scanner;

public class HCFOfTwoNumbers{ 
      public static int GCD(int a , int b){
        int val;
        int min = Math.min(a, b);
        for(int i = min;i<=1;i++){
            if(a%i==0&&b%i==0){
               return i;
            }
        }
            return 1;
      }


    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.print(GCD(a, b));
        }

    }
   
}