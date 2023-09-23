package mfp;

public class Advpatt {
	public static void main(String[] args) {
		
		//Diamond
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=5;j>=i;j--)
				System.out.print(" ");
			
			
			//right diamond part
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			
			
			
			System.out.println();
		}
//inverted diamond
		for(int i=5;i>=1;i--)
		{
			//space
			for(int j=5;j>=i;j--)
				System.out.print(" ");
			
			
			//right diamond part
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			

			
			
			System.out.println();
		}

		
		
		System.out.println("_________________________________________________");
		
		//Diamond
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=5;j>=i;j--)
				System.out.print(" ");
			
			
			//right diamond part
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			//left diamond part
				if(i>1)
				{
					for(int j=1;j<=i;j++)
						System.out.print("*");
				}
			
			
			System.out.println();
		}
//inverted diamond
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			
			
			//right diamond part
			for(int j=5;j>=i;j--)
				System.out.print("*");
			

			for(int j=5;j>i;j--)
				System.out.print("*");
			
			
			
			System.out.println();
		}

		
		
		System.out.println("_________________________________________________");
		
		//Palindrom pyramid
		
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=4;j>=i;j--)
				System.out.print(" ");
			
			//half of the number pyramid
			for(int j=i;j>=1;j--)
				System.out.print(j);
			//right half of the pyramid
			
			if(i>1)
			{
				for(int k=2;k<=i;k++)
					System.out.print(k);
			}
			
			
			
			System.out.println();
		}
		
		
		System.out.println("_________________________________________________");
		
		//number pyramid
		for(int i=1;i<=5;i++)
		{	
			//space
			for(int k=5-i;k>0;k--)
				System.out.print(" ");
			
			//pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("_________________________________________________");
		
		
		
		//for space
		
		//for pattern
		for(int i=1;i<=5;i++) 
		{	
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
				
			} System.out.println();
		}
		
		
		System.out.println("_________________________________________________");
		
		int n=4;
		//upper rows
		for(int i=1;i<=4;i++) 
		{
			//1st part
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			//spaces
			for(int k=(n-1)*2;k>0;k--)
				System.out.print(" ");
			n--;
			
			//2nd part
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		//lower part
		n=4;
		for(int i=1;i<=4;i++) 
		{
			//1st part
			for(int j=n;j>=i;j--)
				System.out.print("*");
			
			//spaces
			for(int k=2*(i-1);k>0;k--)
				System.out.print(" ");
			
			
			//2nd part
			for(int j=n;j>=i;j--)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
