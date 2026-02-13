import java.util.Scanner;

public class MultipleCatch {
    
    public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
         arr[i] = input.nextInt();
      }
      int index = input.nextInt();
      int divisor = input.nextInt();

      try {
         int result = arr[index] / divisor;
         System.out.println(result);
      } 
      catch (ArithmeticException e) {
         System.out.println("Divide by zero error");
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid Index");
      }

      input.close();
   }
    
}
