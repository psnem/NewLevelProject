package mfp;

public class Solidpr {
	public static void main(String[] args) {
		
		
		
		
		//half right pyramid
				for(int i=1; i<=5;i++)
				{	
					for(int k=1;k<=(5-i);k++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++)
						System.out.print("*");
					
					
					
					System.out.println();

					//for(int j=1;j==i)
				
				
					
				}
			

				System.out.println();
				System.out.println("____________________________________________________________________________");
				
		//inverted half pyramid
		for(int i=1; i<=5;i++)
		{
			for (int j=5;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}

		System.out.println();
		System.out.println("____________________________________________________________________________");
		
		//half left pyramid
		for(int i=1; i<=5;i++)
		{
			for (int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
			
		System.out.println("____________________________________________________________________________");
			
			

		System.out.println();
			
		//hollow box
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++) {
				if(i==1||i==4||j==1||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
	}
}
