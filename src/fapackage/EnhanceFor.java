package fapackage;

import java.util.Scanner;

public class EnhanceFor {
	public static void main (String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		for(int val:a)
		{
			if(val%2==0)
				System.out.print(val);
		}
		System.out.println();
		for(int val:a)
		{
			if(val%2!=0)
				System.out.print(val);
		}
	}
}
