package LeetCodeProblems;

public class ProductOfArrayExceptSelf {

  public int[] ProductOfArray(int[] nums){
    int right[] = new int[nums.length];
    int result[] = new int[nums.length];



    for(int i = 0;i<nums.length;i++){

         int left= 1;
         int product = 1;
        for(int j = 1; j<=nums.length;j++){
            
             //right[i];
        }

    }





    return nums;
  }

  



    public static void main (String args[])
{


    int[] input = {1,2,3,4};
    ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
    obj.ProductOfArray(input);

}    
}
