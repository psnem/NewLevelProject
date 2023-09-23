package fapackage;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the data");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
		

		if(str.equals(rev))
			System.out.println("String is palindrom");
		else
			System.out.println("It is not ");

	}

}
