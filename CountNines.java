
public class CountNines {
		
		public static int countAllNines(int n1,int n2){
			int count=0,num = 1;
			if( n1 < 0 || n2 < 0 )
				return -1;
			/*if((n1 == 0) ||(n2 == 0))
				return -2;*/
			if(n1<n2)
			{
				for(int i = n1;i<=n2;i++)
				{	
					num = i;
					while( num>0)
					{
						if(num%10==9)
							count++;
						num -= num%10;
						num = num/10;

					}
				}
				
			}

			else if(n1>n2)
			{
				for(int i = n1;i>=n2;i--)
				{	
					num = i;
					while( num>0)
					{
						if(num%10==9)
							count++;
						num -= num%10;
						num = num/10;

					}
				}
			}
			if(count == 0)
				return-3;
			return count;
		}
		public static void main(String[] args) {
			System.out.println(countAllNines(79,99));
			System.out.println(countAllNines(900,898));
			System.out.println(countAllNines(9002223,89232));
			System.out.println(countAllNines(-2,-4));
			System.out.println(countAllNines(10,15));
			System.exit(0);
					
		}


}
