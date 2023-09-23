package fapackage;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="aaabbbccca";
		int flag=1;					
		String c="";
		for(int i=0;i<A.length();i++)
		{
			for(int j=i+1;j<A.length();j++)
			{
				if(A.charAt(i)==A.charAt(j) ){
					
					flag++;
				}
			}
			System.out.println(A.charAt(i)+ " is "+ flag+ " times ");
			flag=1;
		}

	}

}
