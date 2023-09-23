package mfp;
import java.util.*;

public class Switchpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
			case 1:
				System.out.println("Sunday");
				break;

			case 2:
				System.out.println("Monday");
				break;

			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("out of the range");
		}
	

	}

}
