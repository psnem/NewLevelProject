package ApnaCollege;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {1,5,22,33,11,6};
		for(int i=0;i<A.length-1;i++)
		{	
			int smallest=i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[smallest]>A[j])
					smallest=j;
				
			}
			int temp=A[smallest];
			A[smallest]=A[i];
			A[i]=temp;
		}
		
		for(int value:A)
			System.out.println(value);
	}

}
