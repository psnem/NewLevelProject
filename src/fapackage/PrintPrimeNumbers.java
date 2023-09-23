package fapackage;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Print prime number upto ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{	
			int count=0;
			for(int j=1;j<=num;j++)
			{
			if(i%j==0)
				count++;
			}
			if(count==2)
				System.out.println(i);
			
		}
	}
	
	
}
