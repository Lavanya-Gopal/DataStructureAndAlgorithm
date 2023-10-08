package CountNumberOfDigitsInNum;
import java.util.*;

public class CountNum {
    public static void main(String args[]){
          Scanner s = new Scanner(System.in);
          int num = s.nextInt();
          System.out.println(CountDigit(num));

    }

    public static int CountDigit(int num) {
        int count = 0;
        while(num>0){
              int rem= num%10;
             count++;
             num= num/10;
        }
        return count;
    }
    
}
