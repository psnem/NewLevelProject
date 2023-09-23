package ApnaCollege;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n, String src, String hlp, String des)
	{
		if(n==1)
		{
			System.out.println("Transfer disk"+ n + "from " +src +"to"+des);
			return;
		}
		towerOfHanoi(n-1, src, des, hlp);
		System.out.println("Transfer disk"+ n + "from " +src +"to"+des);
		towerOfHanoi(n-1, hlp, src, des);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		towerOfHanoi(n,"S","H","D");

	}

}
