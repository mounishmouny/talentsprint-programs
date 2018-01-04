package programs_TS;

import java.util.Scanner;

public class PrimeOrNot1 {

	
	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("ENTER the positive number");
		
		if(number == 0|| number==1)
		{
			System.out.println("number is neither prime ");
		count++;
		}
		if(number==2)
			System.out.println("number is prime");
		else
		{
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0){
					System.out.println("number is NOT prime");
					count=1;
				break;
				}
					
			}
			if(count==0)
				System.out.println("number is PRIME");
			
		}
	}

}
