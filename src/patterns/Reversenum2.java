package mfp;

import java.util.Scanner;

public class Reversenum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		StringBuilder sb= new StringBuilder(String.valueOf(num));
		
		System.out.println(sb.reverse());
		
		System.out.println("Enter the number again");
		int num2=sc.nextInt();
		
		StringBuilder sb2= new StringBuilder();
		
		sb2.append(num2);
		System.out.println(sb2.reverse());


	}

}
