package mfp;
import java.util.*;


public class Stringpractice {

	public static void main(String[] args) {
		// Concatenation practice
		/*
		String Fname="Rama";
		String Sname=" Kant", Lname=" Sharma";
		String FullName=Fname+Sname+Lname;
		System.out.println(FullName);
		*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname=s.next();
		String sname,lname;
		System.out.println("Enter the Second name");
		sname=s.next();
		System.out.println("Enter the third name");
		lname=s.next();

		System.out.println("Enter your user name");
		String uname,mail;
		uname=s.next();

		System.out.println("Enter the mail company  name");
		mail=s.next();

		System.out.println("Your full name is :" + fname+ " " +sname+ " " +lname);

		System.out.println("Your mail id is :" +uname +"@" +mail);

	}

}
