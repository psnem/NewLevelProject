package ApnaCollege;

public class RecurRevString {
	public static void revString(String str, int idx)
	{
		if(idx==0)
		{
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		revString(str, idx-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String st="abcd";
			int idx=st.length();
			revString(st,idx-1);
		

	}

}
