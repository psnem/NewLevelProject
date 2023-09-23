package fapackage;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,30,40,5,20,90};
		int max=a[0];
		int min=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
			
		}
		System.out.println("maximum of the array " +max);
		System.out.println("Minimum of the array " +min);
	}

}
