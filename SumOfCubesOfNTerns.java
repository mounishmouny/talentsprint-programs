package programs_TS;

import java.util.Scanner;

public class SumOfCubesOfNTerns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int digit,cube=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			while(number>0)
			{
				digit = number%10;
				number = number/10;
				cube = (digit*digit*digit);
				sum = sum + cube;  
			}
			System.out.println(sum);
		}

	}

}
