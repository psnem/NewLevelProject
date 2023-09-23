package mfp;

public class Stringbuilderpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("Piyush");
		System.out.println(sb);
		
		//replacing the 1st char
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'Q');
		System.out.println(sb);
		
		//forget 1st word now add the missing char
		StringBuilder sb2=new StringBuilder("iyush");
		System.out.println(sb2);
		sb2.insert(0,'P');
		System.out.println(sb2);
		
		sb2.setCharAt(1,'e');
		System.out.println(sb2);
		sb2.insert(1,'e');
		System.out.println(sb2);
		
		//delete a char
		sb2.delete(2, 3);
		System.out.println(sb2);

		sb2.delete(1, 3);
		System.out.println(sb2);
		
		sb2.append("ed");		//in string we would do sb=sb+"ed"
		System.out.println(sb2);
		
	}

}
