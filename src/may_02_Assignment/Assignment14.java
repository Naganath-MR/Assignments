package may_02_Assignment;

public class Assignment14 {
	public static void main(String[] args) {
		
		        // This variable is for the maximum number in the middle row
		        int maximumNumber = 5;

		        // Upper Diamond values till middle row ( //1 to //1 2 3 4 5 )
		        int currentRow = 1;
		        
		        while (currentRow <= maximumNumber) {
		            int number = 1;
		            while (number <= currentRow) {
		                System.out.print(number + " ");
		                number = number + 1;
		            }
		            System.out.println();
		            currentRow = currentRow + 1;
		        }

		        // Lower Diamond values till (without middle row)
		        // 1 2 3 4  to // 1
		        currentRow = maximumNumber - 1;  //4
		        while (currentRow > 0) { //4 >0 //3>0
		            int number = 1;
		            while (number <= currentRow) { //1<=4 //2<=4 //3<=4 //4<=4 //5<=4
		                System.out.print(number + " "); //1 // 2 //3 //4
		                number = number + 1; //2 //3 //4 //5
		            }
		            System.out.println();
		            currentRow = currentRow - 1; //3
		        }
		    }
		}


	


