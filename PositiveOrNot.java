package programs_TS;

import java.util.Scanner;



public class PositiveOrNot {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number <0)
			System.out.println("given number is a negative number");
		else
			System.out.println("given number is a positive number");
		
	}

}
