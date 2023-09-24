package fapackage;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		if(num>1) 
		{
			
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
				
			}
			if(count==2)
				System.out.println("Number  is prime");
			else
				System.out.println("not prime" + count);
		}
		else
			System.out.println("Not prime");
	}
}
