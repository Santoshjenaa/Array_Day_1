package arrayProgram;

import java.util.Scanner;

//Write a java program to add the last and first element of a given array.
//
//Input as: [1,2,3,4,5,6]
//Output as: 7


public class AddLastAndFirstIndex
{
	
  public static  void addIndexValue(int a[])
  {
	  int firstDigit = a[0];
	  int lastDigit = a[(a.length)-1];
	  
	  System.out.println("sum of first and last index value is "+(firstDigit+lastDigit));
  }
	
  public static void main(String [] args)
  {
	 System.out.println("Enter array size");
	 Scanner sc = new Scanner(System.in);
	 int size = sc.nextInt();  
	
	 System.out.println("Enter "+size+" Element for your array");
	 int arr[] = new int[size];
	 for(int i =0;i<arr.length;i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 System.out.println("Element added successfully ");
	 addIndexValue(arr);
  }
}
