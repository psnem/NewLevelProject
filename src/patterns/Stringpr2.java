package mfp;

public class Stringpr2 {

	public static void main(String [] arg) {
		String s="Piyush",t=" Sharma",u=s+t;
		for(int i=0;i<s.length();i++) {
			System.out.print(" " +s.charAt(i));
		}
		System.out.println();

		System.out.print("Revers of the string :");
		for(int i=s.length()-1;i>=0;i--) 
			System.out.print(" " +s.charAt(i));

		System.out.println();
		
			if(s.compareTo(t)==0)
				System.out.println(" same name");
			else
				System.out.println(" not same");
		System.out.println(u.substring(0));
		System.out.println(u.substring(7,13));
		
	}
}
