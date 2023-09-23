package ApnaCollege;

public class Recursion2 {
	
	public static void sumloop(int n,int sum)
	{
		if(n==5)
		{
			sum+=n;
			System.out.println(sum);
			return;
			
		}
		sum+=n;
		n++;
		
		sumloop(n,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;
		sumloop(n,sum);
		

	}

}
