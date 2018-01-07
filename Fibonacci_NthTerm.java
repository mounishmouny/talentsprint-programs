import java.util.Scanner;


public class Fibonacci_NthTerm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println(getNthTermOfFibonacciSeries(n));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		int n1 = 0,n2 = 1,n3=0;
		if(nthTerm<=0)
			return -1;
		else
		{
			for(int i=2;i<=nthTerm;i++)
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		}
		return n1;
	  
	   }
	

}