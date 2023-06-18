import java.util.*;

class SumOfNumbers{
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num = s.nextInt(); 
        int sum =0;
        int arr[] = new int[num];
        for(int i =0;i<num;i++){
            System.out.print("Enter the number :");
        try{
            arr[i]=s.nextInt();
            sum+=arr[i];

        }
        catch(Exception e){
            System.out.print(e);

        }
            


        }
        System.out.println("Total sum of all numbers"+sum);
        s.close();




    }
}