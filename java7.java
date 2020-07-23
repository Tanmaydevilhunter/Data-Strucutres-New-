/*
Optimise buble sort
15th July
*/
class BubbleSort 
{ 
     public static void main(String args[])
   {
     int i, num, item, array[];
      Scanner input = new Scanner(System.in);
      num = input.nextInt(); 
      array = new int[num]; 
      for (i = 0; i < num; i++)
        {
        array[i] = input.nextInt();
        }
      item = input.nextInt();
	  for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                {  
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
   }
} 
