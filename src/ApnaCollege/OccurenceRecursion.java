package ApnaCollege;

public class OccurenceRecursion {
	static int first=-1;
	static int last=-1;
	public static void occur(String str,int id,char element) {
		if(id==str.length())
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char curr=str.charAt(id);
		if(curr==element)
		{
			if(first==-1)
				first=id;
			else
				last=id;
			
			
		}
		occur(str,id+1,element);
		
	}

	public static void main(String[] args) {
		String str="abaababaab";

		occur(str,0,'b');
		

	}

}
