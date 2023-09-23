package fapackage;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num/=10;
		}
		System.out.println(sum);
	}
}
