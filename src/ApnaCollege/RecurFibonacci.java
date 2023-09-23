package ApnaCollege;

public class RecurFibonacci {
	public static void fib(int n,int a,int b)
	{
		if(n==0) {
			
			return;
		}
		int c=a+b;
		System.out.print(" "+c);
	
		fib(n-1,b,c);
	
	}
	public static void main(String[] args) {
		int n=10,a=0,b=1;
		System.out.print(a +" " +b);
		fib(n-2,a,b);

	}

}
