package programs_TS;

import java.util.Scanner;

public class Fibonocci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number<0)
			System.out.println("PLEASE enter the POSITIVE NUMBER");
		else
		{
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			for(int i=2;i<=number;i++)
			{
				n3 = n1 + n2;
				System.out.print(n3+" ");
				n1 = n2;
				n2=n3;
				
			}
		}
		
		
	}

}
