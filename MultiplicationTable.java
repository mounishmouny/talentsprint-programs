package programs_TS;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			for(int i=0;i<=10;i++)
			{
				int value = number*i;
				System.out.println(number + " " + "X" + " " +i +" = "+value);
			}
		}
	}

}
