package fapackage;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		boolean eq=Arrays.equals(a,b);
		if (eq==true) {
			System.out.println("both array are equal");
		
		}
		else
			System.out.println("Arrays are not equal");
		int count=0;
		if (a.length==b.length) {
			
			for(int i=0;i<a.length;i++)
			{
				if (a[i]==b[i]) {
					count++;
				}
				else
					System.out.println("Array is not equal");
				
			}
			if(count==a.length)
				System.out.println("Array is equal");
			
		}
		else
			System.out.println("Array is not equal");

	}

}
