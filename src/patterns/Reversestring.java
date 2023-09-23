package mfp;
import java.util.*;
public class Reversestring {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev +str.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("Enter the string");
		String str2=s.next();
		char c[]=str2.toCharArray();//store string as char 
		String rev2="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev2=rev2+c[i];
		}
		System.out.println(rev2);
		
		System.out.println("Enter the string");
		String str3=s.next();
		
	}

}
