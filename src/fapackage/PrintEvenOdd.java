package fapackage;

public class PrintEvenOdd {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		System.out.print("Even numbers are:  ");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
				
		}
		System.out.println();
		System.out.print("Odd numbers are:  ");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
				
		}
		
	}
}
