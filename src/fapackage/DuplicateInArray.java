package fapackage;

public class DuplicateInArray {
	public static void main(String arg[]){
		String A[]= {"Piyush","Durgesh","Chandu","Piyush","Durgesh"};
		int flag=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]==A[j]) {
					System.out.println(A[i]+ " is duplicate");
					flag++;
				}
			}
			
		}
		if(flag==0)
			System.out.println("No Duplicate is found");
		
	}
}
