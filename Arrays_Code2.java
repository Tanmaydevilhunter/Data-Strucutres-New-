/*
 Sort an array with and without Bubble Sort.
14th July
*/
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Code2 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Sorted");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
    
}