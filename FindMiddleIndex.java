package arrayProgram;

//Write a java program to find the middle elements of a given array. 
//If array is odd then print only the middle element, if array is even then
//print both the middle elements.
//
//Input as : 1 2 3 4 5  
//Output is : 3
//Input is :1 2 3 4 5 6 
//Output is :3 4


import java.util.Scanner;

public class FindMiddleIndex
{

	public void getMiddleIndex(int arr[])
	{
		
	}
	
    public static void main(String [] args)
    
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter array size : ");
    	int size = sc.nextInt();
    	System.out.println("Enter "+size+" Element for array ");
    	int a[] = new int[size];
    	for(int i = 0;i<a.length;i++)
    	{
    		a[i] = sc.nextInt();
    		
    	}
    sc.close();	
    }
    
}
