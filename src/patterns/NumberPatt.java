package mfp;

public class NumberPatt {
	public static void main(String[] arg) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
			}
		
		
		
		
		System.out.println("____________________________________________________________________________");
		
		
		int count=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((count+=1) + " ");
				
			}System.out.println();
			
		}
		
		
		
		System.out.println("____________________________________________________________________________");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j);

			System.out.println();
		
		}
		System.out.println("____________________________________________________________________________");
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(j);
				
			}System.out.println();
			
		}
		
		System.out.println("____________________________________________________________________________");
		
		
		
	}
}
