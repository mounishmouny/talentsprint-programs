package programs_TS;

import java.util.Scanner;

public class DiscountBasedOnPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price");
		int price = sc.nextInt();
		int mrp;
		int discount;
		if(price>0 && price<=10000)
		{
			discount= price*10/100;
			mrp = price-discount;
			System.out.println("The selling price ="+mrp);
		}
		if(price>10000 && price<=20000)
		{
			discount = price*20/100;
			mrp = price-discount;
			System.out.println("The selling price ="+mrp);
		}
		if(price>20000)
		{
			discount = price*25/100;
			mrp = price-discount;
			System.out.println("The selling price ="+mrp);
		}
		
		

	}

}
