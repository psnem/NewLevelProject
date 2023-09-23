package fapackage;

import java.util.Scanner;

public class FindingLargest {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c;

	System.out.println("Enter the value of a");
	a=sc.nextInt();
	System.out.println("Enter the value of b");
	b=sc.nextInt();
	System.out.println("Enter the value of c");
	c=sc.nextInt();
	if(a>b&&a>c)
		System.out.println("A is the largest");
	if(b>c&b>a)
		System.out.println("B is the largest");
	else 
		System.out.println("C is the largest");
	
	}
}
