package fapackage;

import java.util.Random;

public class RandomNumString {
	public static void main (String[] arg)
	{
		Random r=new Random();
		int rnum=r.nextInt(100);
		System.out.println(rnum);
		double dnum=r.nextDouble();
		System.out.println(dnum); //it take automatically between 0.0 to 1
		System.out.println(Math.random());
		
		
	}
}
