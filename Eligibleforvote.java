package programs_TS;

import java.util.Scanner;

public class Eligibleforvote {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int number = sc.nextInt();
		
		if(number < 18)
		 System.out.println("person is not eligible to vote");
		else
			System.out.println("person is eliible to vote");

	}

}
