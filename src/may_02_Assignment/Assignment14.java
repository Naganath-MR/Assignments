package may_02_Assignment;

public class Assignment14 {
	public static void main(String[] args) {
		
		
		        int n = 5; // Maximum number on the center line

		        // Upper pattern with middle row
		        for (int i = 1; i <= n; i++) {
		            
		        	// To Print spaces
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            // To print upper numbers
		            for (int k = 1; k <= i; k++) {
		                System.out.print(k + " ");
		            }
		            System.out.println();
		        }

		        // Lower pattern without middle row
		        for (int i = n - 1; i >= 1; i--) {
		            // To Print spaces
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }
		            // To print lower numbers
		            for (int k = 1; k <= i; k++) {
		                System.out.print(k + " ");
		            }
		            System.out.println();
		        }
		    }
		}

		    

	


