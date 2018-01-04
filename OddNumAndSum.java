package programs_TS;

import java.util.Scanner;

public class OddNumAndSum {

	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			for(int i=1;i<=number;i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
					sum = sum + i;
				}
			}
			System.out.println("sum of all the odd numbers is "+sum);
		}
		
	}

}
