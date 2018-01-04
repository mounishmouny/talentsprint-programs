package Patterns;

import java.util.Scanner;

public class ReverseOfNRAP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// reverse of number right angled pyramid
		
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int number = sc.nextInt();
				
				if(number<0)
					System.out.println("PLEASE enter the POSITIVE NUMBER");
				else
				{
					for(int i=1;i<=number;i++)
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


