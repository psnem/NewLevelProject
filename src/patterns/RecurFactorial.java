package ApnaCollege;

public class RecurFactorial {
	public static void fact(int n,int fact)
	{
		if(n==1)
		{
			System.out.println(fact);
			return;
		}
		fact*=n;
		n--;
		fact(n,fact);
		
	}
	
	
	public static void main(String[] args) {
		
		int fact=1,n=5;
		fact(n,fact);
		

	}

}
