package ApnaCollege;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {44,52,11,32,85,45};
		for(int i=1;i<A.length;i++)
		{
			int current=A[i];
			int j=i-1;
			while(j>=0 && current<A[j])
			{
				A[j+1]=A[j];
				j--;
				
			}
			A[j+1]=current;
		}
		for(int value:A)
			System.out.println(value);

	}

}
