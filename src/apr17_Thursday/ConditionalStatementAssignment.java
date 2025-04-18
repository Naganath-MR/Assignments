package apr17_Thursday;

public class ConditionalStatementAssignment {

	public static void main(String[] args) {
		
		// PROBLEM STATEMENT===============//
		/*A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.
2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.

Now based on below details, print whether user is eligible to get the loan or not
customerName = "John Doe";
creditScore = 720;
income = 55000.0;
isEmployed = true;
debtToIncomeRatio = 35.0;
		
		 */
		
	//	Step1: Variable declaration
	String	customerName = "John Doe";
	int	creditScore = 680;
	double	income = 51000.0;
	boolean	isEmployed = true;
	float	debtToIncomeRatio = 33.0f;
	
	//Condition 1: Creditscore > 750 ==> Loan will approve automatically
	
	if(creditScore >720)
	{
		System.out.println(customerName +"'s loan is automatically approved");
	}
	
	//condition 2: If the credit score is between 650 and 750, additional checks are performed.
	// 1. For credit scores between 650 and 750, the customer’s income must be at least $50,000 for the loan to be considered.
	// 2. If the customer’s income is at least 50,000, the system checks whether the customer is employed.
	//3. If the customer is employed, the system checks the debt-to-income (DTI) ratio.
	//4. If the DTI ratio is less than 40%, the loan is approved.
	//5.If the DTI ratio is 40% or greater, the loan is denied.
if(creditScore>650 && creditScore<750) {
	          if(income>50000)
	          {
	               if(isEmployed ==true)
	               {
	            	   if(debtToIncomeRatio <40.0f) 
	            	   {
	            		   System.out.println(customerName +"'s  loan is approved");
	            	   }
	            	   else
	            	   { 
	            		   System.out.println(customerName +"'s loan is Denied");
	            		   }
	            	   
	               }
	               
//condition 3: If the credit score is below 650 & income is less than 50,000, the loan is denied.
	          else if(creditScore<650) {
	        	  System.out.println(customerName +"'s loan is denied");
	          }
	          else if(income<50000) {
	        	  System.out.println(customerName +"'s loan is denied");
	          }


//condition 4: If the customer is unemployed, the loan is denied.
	          else if(isEmployed==false) {
	        	  System.out.println(customerName +"'s loan is denied");
	        	  
	          }
	          else if (debtToIncomeRatio>40.0f)
	          {
	        	  System.out.println(customerName +"'s loan is denied");
	        	  
	          }

	               }}


}}
	
	
	
	
	

