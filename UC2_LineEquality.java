package Assi_eight;

import java.util.Scanner;

class Geometry
{
	public static int getLengthOfLine(Scanner scan) 
	{
		// User Input
		  System.out.println("enter x1 point");
	      int x1=scan.nextInt();
	      
	      System.out.println("enter y1 point");
	      int y1=scan.nextInt();
	      
	      System.out.println("enter x2 point");
	      int x2=scan.nextInt();
	      
	      System.out.println("enter y2 point");
	      int y2=scan.nextInt();
		
	      int val1 = (int) Math.pow((x2 - x1), 2);
	      int val2 = (int) Math.pow((y2 - y1), 2);
	      int result = (int) Math.sqrt(val1 + val2);
	      return result;
	}
	public void greatersmaller() 
	{
		// User Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for line 1");
		int lengthOfLine_1 = getLengthOfLine(scan);
		System.out.println("Please enter value for line 2");
		int lengthOfLine_2 = getLengthOfLine(scan);
		
		int val1 = lengthOfLine_1;
		int val2 = lengthOfLine_2;
		
		// To check greater than or less than
		if (val1 == val2) {
			System.out.println("Both lines are equal");
		} else if (val1 < val2) {
			System.out.println("Lines 2 is greater");
		} else {
			System.out.println("Lines 1 is greater");
		}
		scan.close();
		
	}
}
public class UC2_LineEquality 
{
	public static void main(String[] args) 
	{
		 System.out.println("Welcome to Line Comparison Program");
		 
		 // Creating an object
		 Geometry x = new Geometry();
		 // Calling methode
		 x.greatersmaller();     
	 }
}