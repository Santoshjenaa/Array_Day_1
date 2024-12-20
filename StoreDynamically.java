package arrayProgram;
import java.util.Scanner;
//Write a program to store array dynamically by reading the size 
//and elements from the user.
//Input as: 
//Enter size of the array:6
//Enter 6 elements: 1 2 3 4 5 6
//Output is: 
//Array elements are: 1 2 3 4 5 6

public class StoreDynamically
{
	public static void printArray(int a[])
	{
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
     public static void main(String [] args)
     {
    	 System.out.println("Enter array size : ");
    	 Scanner sc = new Scanner(System.in);
    	 int size = sc.nextInt();
    	 
    	 System.out.println("Enter "+ size +" Element for array = ");
    	 int arr []=new int[size];
    	 for(int i = 0;i<arr.length;i++)
    	 {
    		 arr[i] =sc.nextInt();
    	  }
    	 System.out.println("Sucessfully Enter "+size+" Element");
    	 System.out.println("Now we print all array : ");
    	 printArray(arr);
    	 sc.close();
     }
     
}
