package mfp;
import java.util.*;

public class brkcontnpr {
	public static void main(String[] arg) {
		for(int i=1;i<20;i++) {
			if(i==10)
				continue; 
			System.out.print(i + " ");
			
			
		}
		
		for(int i=1;i<20;i++) {
			if(i==10)
				break; 
			System.out.print(i + " ");
			
			
		}
	}
}
