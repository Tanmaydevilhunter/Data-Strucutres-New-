/*
Linear search
15th July
*/
import java.util.*;
public class Arrays_Code6 {
    public static void main(String args[])
   {
      int i, num, item, array[];
      Scanner input = new Scanner(System.in);
      System.out.println("Enter size");
      num = input.nextInt(); 
      array = new int[num]; 
      System.out.println("Enter " + num + " number");
      for (i = 0; i < num; i++)
        array[i] = input.nextInt();

      System.out.println("Enter the search value:");
      item = input.nextInt();

      for (i = 0; i < num; i++)
      {
         if (array[i] == item) 
         {
           System.out.println(item);
           break;
         }
      }
      if (i == num)
        System.out.println(item + " not");
   }
    
}