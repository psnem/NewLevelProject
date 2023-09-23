package fapackage;

import java.util.Scanner;

public class LargestTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		int largest=(a>b)?a:b;
		largest=largest>c?largest:c;
		System.out.println(largest);

	}

}
