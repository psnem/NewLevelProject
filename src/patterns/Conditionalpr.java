package mfp;
import java.util.*;

public class Conditionalpr {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the time");
	int time=sc.nextInt();
	
	if (time>=12 && time<16)
		System.out.println("It is noon");
	else if (time>24)
		System.out.println("Invalid time");
	else if (time>16 && time <=18)
		System.out.println("It is evening");
	else if(time<12)
		System.out.println("It is morning");
	else
		System.out.println("it is night");
	}

}
