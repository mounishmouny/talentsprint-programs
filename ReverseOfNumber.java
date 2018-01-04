package programs_TS;

import java.util.Scanner;

public class ReverseOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int digit,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int num = number;
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			while(number>0)
			{
				digit = number%10;
				number = number/10;
				rev = rev*10+digit;
			}
			System.out.println("number is : "+num);
			System.out.println("Reverse of number is: "+rev);
		}
		

	}

}
