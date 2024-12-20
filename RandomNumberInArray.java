package arrayProgram;
import java.util.Scanner;
public class RandomNumberInArray
{
	public  static void printArray(int a[])
	{
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
   public static  void main(String [] args)
   {
	   System.out.println("Enter array size : ");
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
      System.out.println("Now we generate random number for your array ");
       int arr[] = new int[size];
      for(int i =0;i<arr.length;i++)
      {
    	  arr[i] =(int)(Math.round(i)*10)+1;
      }
      printArray(arr);
      sc.close();
   }
}
