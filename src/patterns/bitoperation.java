package mfp;

public class bitoperation {
	public static void main(String [] arg)
	{
		
		
		//Get operation 
		int n=3; // its bit value 011
		int pos=2;
		int bitmask=1<<pos;
		// get operation needs AND operation
	if ((bitmask & n)==0)
		System.out.println("Number was zero");
	else

		System.out.println("Number was 1");
	
	//Set operation
	int n2=5; //101
	int pos2=1;
	int bitmask2=1<<pos2;
	 int setnum= n2 | bitmask2;
	 System.out.println(setnum);
	
	 //clear operation
	 int n3=5; //101
	 int pos3=2;
	 int bitmask3=1<<pos3;
	 int notbitmask3=~(bitmask3);
	 int clrnum=notbitmask3 & n3;
	 System.out.println(clrnum);
	 
	 //update bit
	 
	 
	 
	}
}
