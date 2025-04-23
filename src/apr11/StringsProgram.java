package apr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsProgram {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		Integer b[] = new Integer[a.length];
		
		for(Integer x:b) {
		System.out.println(x);
		
		}
		
		
	System.out.println(Arrays.toString(a));
			
		List<Object> li = new ArrayList<Object>(Arrays.asList(b));
	
		for(Object x: li) {
			
			System.out.println(x);
		}
		
		
		
	
		
		

	}

}
