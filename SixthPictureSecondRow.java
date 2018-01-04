package Patterns;

import java.util.Scanner;

public class SixthPictureSecondRow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			for(int i=number;i>=1;i--)
			{
				for(int j =number;j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}

	}

}
