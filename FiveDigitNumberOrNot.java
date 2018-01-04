package programs_TS;

import java.util.Scanner;

public class FiveDigitNumberOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();

		if(number >9999)
			System.out.println("number is a five digit number");
		else
			System.out.println("given number is not a five digit number");
	}

}
