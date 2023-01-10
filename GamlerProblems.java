package Gamler;

import java.util.Scanner;



public class GamlerProblems {
	double betPrice,stack,goal;
	int no;
	int utility;
	
	GamlerProblems()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack Price :");
		int stack=sc.nextInt();
		
		
		System.out.println("Enter bet Price :");
		int bet=sc.nextInt();
		
		
		if(stack>=bet||stack<=0)
		{ 
			System.out.println("!!!!!!stack is good!!!!!!");
		}
		else
		{
			System.out.println("!!!!bet is good!!!!!!");
		}
		
		System.out.println("Stack is:"+stack);
		System.out.println("Bet is:"+bet);
	}
	
	public static void main(String[] args) {
		
		GamlerProblems g1=new GamlerProblems();
		
		
		
	}

}
