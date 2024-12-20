package arrayProgram;

//Write a Java program to create an integer array of size 5.
//Initialize the array with the numbers 10, 20, 30, 40, and 50,
//and display all the elements using a for loop.

public class ShowArrayValue
{
  
	public static void main(String[] args) {
		

		int a[] = {10,20,30,40,50};
		
		System.out.println("All array value are : ");
		for(int i =0;i<a.length;i++)
		{
			System.out.println("Index number is "+i+" and  value is "+a[i]);
		}
	}
}
