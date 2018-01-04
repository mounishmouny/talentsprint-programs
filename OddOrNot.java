package programs_TS;

import java.util.Scanner;

public class OddOrNot {

	
	public static void main(String[] args) {
		int count=0,ref=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		
		else
		{
		while(number>0)
		{
			int digit = number%10;
			number = number/10;
			
			if(digit%2==0){
				System.out.println("all the digits are NOT odd");
				count=0;
				break;
			}
			else
				count++;
			
			ref++;	
			
		}
		if(count==ref)
		System.out.println("all the digits are ODD");

		}
	}

}
