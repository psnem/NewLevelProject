package mfp;
import java.util.*;

public class Scannerpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.next();

		System.out.println("Enter your Age");
		int age=sc.nextInt();
		
		System.out.println(name + " " + age); 

		System.out.println("Enter your message");
		String s=sc.nextLine();

		System.out.println(s);
	}

}
