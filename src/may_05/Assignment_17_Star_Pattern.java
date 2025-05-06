package may_05;

public class Assignment_17_Star_Pattern {

	public static void main(String[] args) {
		/*   
		      //To print below Triangle pattern
		      *
	 		 **
	 	    ***
           ****
          *****
		  
		
		 * 
		 */
		
		
		int lines= 5; //Total lines
		
		for(int i=1 ; i<=lines; i++) {
			
			
			//To print space
			
			for(int j=1; j<=lines-i; j++) {
				
				System.out.print(" ");
				
			}
			
			//To print stars
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			//Move to next line ,after each line
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
