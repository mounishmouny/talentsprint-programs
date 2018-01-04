package programs_TS;

import java.util.Scanner;

public class LeapYearOrNot {

	
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();

			if(year%100 == 0)
			{
				if(year%400==0)
				{
					System.out.println("given year is a leap year");
				}
				else
					System.out.println("given year is n ot a leap year");
				
			}
			else if(year%4==0)
				System.out.println("given year is a Leap Year");
			else
				System.out.println("not a leap year");
				
	}

}
