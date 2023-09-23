package mfp;
import java.util.*;

public class prepostexp {
	public static void main(String[] arg) {
		int a=10;
		int b=0;
		b=a++;
		System.out.println(a); //11
		System.out.println(b); //10
		

		b=a--;
		System.out.println(a); //10
		System.out.println(b); //11
		
		b=++a;
		System.out.println(a); //11
		System.out.println(b); //11
		

		b=--a;
		System.out.println(a); //10
		System.out.println(b); //10
		
	}
}
