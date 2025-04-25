package apr24;

import java.util.Arrays;

public class Assignment10_ArraysSort {

	public static void main(String[] args) {
		
		int a[] = {12,34,11,36,87,98,93};
		int temp;
		// Given values are 12,34,11,36,87,98,93.
		// Store the values in Array and Print second and third largest number from the above values 
		// without using collections and default sort methods
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]> a[j]) { //12>11  // a[i]=12 ; a[j]=11
				
				temp = a[i];  // temp = 12
					   a[i] =a[j]; // a[i]= 11
					         a[j]=temp; // 12 //a[j]= 12
			
			
			
				}
				
			}	
			
		}
		System.out.println("Arrays in Ascending Order==");
		
		for(int i=0; i<a.length;i++) {
			System.out.print (a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Total length of the given array is: " +a.length);
		System.out.println("Second largest no is: "+ a[5]);
		System.out.println("Third largest no is: "+ a[4]);
		
	}}


