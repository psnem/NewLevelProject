package mfp;
import java.util.*;

public class Revstring {
	public static void main(String[] args) 
	{   
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println(name);
		
		
		
		StringBuilder str= new StringBuilder(name);
		for(int i=0;i<str.length()/2;i++)
		{
			int front=i;
			int back=str.length()-1-i;
			char frontchar=str.charAt(front);
			char backchar=str.charAt(back);
			
			str.setCharAt(front,backchar);
			str.setCharAt(back, frontchar);
		
		}
		System.out.println(str);	
	}
	
	
}
