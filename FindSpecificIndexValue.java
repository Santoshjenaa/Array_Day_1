package arrayProgram;

import java.util.Scanner;

//Write a Java program to retrieve the value at a specific index from an array.
//Use an array {100, 200, 300, 400, 500} and retrieve the value at index 3.


public class FindSpecificIndexValue

{
    public static void main(String [] args)
    {
    	int a[] = {100,200,300,400,500};
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter which index value you want : ");
    	int position = sc.nextInt();
    	 
    	System.out.println("Anser is : "+a[position-1]);
       
    }
}
