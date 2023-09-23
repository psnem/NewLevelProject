package fapackage;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String [] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int orgnum=num;
		int rev=0;
		while(orgnum>0)
		{
			rev=rev*10+orgnum%10;
			orgnum/=10;
			
		}
	
		if(num==rev)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

}
