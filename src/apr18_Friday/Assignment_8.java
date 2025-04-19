package apr18_Friday;


import java.util.LinkedList;
import java.util.List;


public class Assignment_8 {

	public static void main(String[] args) {
		
		List <Integer> store = new LinkedList<Integer>();
		store.add(50000);
		store.add(-2000);
		store.add(3000);
		store.add(-15000);
		store.add(-200);
		store.add(-300);
		store.add(4000);
		store.add(-3000);
		System.out.println("Credit & debit transactions are: "+store);
		
		int debitcount=0,creditcount=0;
		int debitamount=0,creditamount=0;
		int suspiciousdebitlimitexceedscount=0;
		int suspiciouscreditlimitexceedscount=0;
		int totalsuspiciouscount=0;
	
		System.out.println("Credit & Debit Transaction Completion Status:==");
		for(int i=0; i<store.size();i++) {
		
			if(store.get(i)>0)
			{
				creditcount++;
				creditamount=creditamount+store.get(i);
			}
			
			else if (store.get(i)<0)
				
			{
				debitcount++;
				debitamount=debitamount+store.get(i);
			}
			}
		
		int RemainingAmount= creditamount-(-debitamount);
		System.out.println("Total number of Credit transactions completed : "+creditcount + " ");
		
		System.out.println("Total number of Debit transactions completed : "+debitcount);
		System.out.println("Total amount Credited in Account : "+creditamount + " ");
		System.out.println("Total amount debited in Account : "+debitamount + " ");
		System.out.println("Total amount Remaining at the end in Bank Account : "+RemainingAmount + " ");
		
		for(int j=0; j<store.size();j++) {
			if(store.get(j)<-10000) {
				suspiciousdebitlimitexceedscount++;
				System.out.println("Suspicious debitTransaction with Amount");
			}
			else if (store.get(j)>10000) {
				suspiciouscreditlimitexceedscount++;
				System.out.println("Suspicious CreditTransaction with Amount");
			}
					
		}
		totalsuspiciouscount = suspiciousdebitlimitexceedscount+suspiciouscreditlimitexceedscount;
		System.out.println("Total number of Suspicious credit/ debit Transaction in Bank Account : "+totalsuspiciouscount);
		
	}
}
