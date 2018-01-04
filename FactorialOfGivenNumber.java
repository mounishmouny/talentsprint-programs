package programs_TS;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			for(int i=1;i<=number;i++)
			{
				fact = fact*i;
			}
			System.out.println("Factorial of "+number+" is: "+fact);
		}

	}

}
