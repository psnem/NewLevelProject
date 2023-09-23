package ApnaCollege;

public class RecurPower {
	public static void	power(int x,int n,int pow)
		{
			if(n==0)
			{
				System.out.println(pow);
				return;
			}	
			 
			pow=pow*x;
			power(x,n-1,pow);
			
		}
	
	public static void main(String[] args) {
		
		int x=6,n=3,pow=1;
		power(x,n,pow);

	}

}
