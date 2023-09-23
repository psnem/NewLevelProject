package ApnaCollege;

public class Recursion1 {
		public static void recur(int j) {
			if(j==0)
				return;
			System.out.println(j);
			 recur(--j);
			
			
		}
		public static void increase(int j) {
			if(j==6)
				return;
			System.out.println(j);
			increase(++j);
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		recur(i);
		System.out.println("I is again becomes"+ i);
		
		int k=1;
		increase(k);
		

	}

}
