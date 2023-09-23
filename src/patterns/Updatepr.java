package mfp;
import java.util.*;

public class Updatepr {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the operation 1 for set 0 for clear");
		
		int oper=sc.nextInt();
		//operation 1 for set and 0 for clear
		
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		
		int bitMask=1<<pos;
		
		if(oper==1)
		{
			int newNumber= bitMask | n;
			System.out.println("bit is set" +newNumber);
			
		}
		else 
		{
			int newBitmask= ~bitMask;
			int newNumber= newBitmask & n;
			System.out.println(newNumber);
		}
	}
}
