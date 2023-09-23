package ApnaCollege;

public class MergeSort {
	public static void conquer(int ar[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		int x=0;
		int idx1=si;
		int idx2=mid+1;
		while(idx1<=mid && idx2<=ei)
		{
			if(ar[idx1]<ar[idx2])
				merged[x++]=ar[idx1++];
			else
				merged[x++]=ar[idx2++];
			
		}
		while(idx1<=mid)
			merged[x++]=ar[idx1++];
		
		while(idx2<=ei)
			merged[x++]=ar[idx2++];
		
		for(int i=0,j=si;i<ar.length;i++,j++)
			ar[j]=merged[i];
		
		
	}
	public static void devide(int ar[], int si,int ei) {
		if(si>=ei)
			return;
		
		int mid=si+(ei-si)/2;
		devide(ar,si,mid);
		devide(ar,mid+1,ei);
		conquer(ar,si,mid,ei);
	}

	public static void main(String[] args) {
		
		int arr[]= {2,6,1,3,9,4};
		int n=arr.length;
		devide(arr,0,n-1);
		
		for(int val:arr)
			System.out.print(" "+val);
	}

}
