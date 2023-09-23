package mfp;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b=20, c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of a and b is "+a +"  "+b);
		
		int x=10, y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x and y is "+x +"  "+y);
		
		int p=10, q=20;
		p=p*q;
		q=p/q;
		p=p/q;
		
		System.out.println("Value of p and q is "+p +"  "+q);
		
		int l=10,m=20;
		l=l^m;
		m=l^m;
		l=l^m;
		System.out.println("Value of l and m is "+l +"  "+m);
		
		int s=10,t=20;
		t=s+t-(s=t);
		System.out.println("Value of s and t is "+s +"  "+t);
		
		
	}

}
