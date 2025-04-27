package apr25;

public class Assignment11 {
	
	public int stockmarket(int[] prices)
	{

		if(prices.length==0) 
		
			return 0;
		
		int MinPrice = prices[0]; //{5,25,15}; // Minprice =5
		int MaxProfit =0;
		
		
		
		
		for( int i=1; i<prices.length;i++)
		{
		if(prices[i] < MinPrice) // 25<5   //15<5
		
		{
			 MinPrice = prices[i] ; //1
		}
		
		else if (prices[i] - MinPrice  > MaxProfit) //20 >0 //10>20
		{
			
			MaxProfit = prices[i] - MinPrice; //20 10
		}
		}
		
		return MaxProfit;
		
		
	
	}	
	
	
	

	public static void main(String[] args) {
		
		Assignment11 Ass = new Assignment11();
		
		int prices[]= {7,1,5,3,6,4};
		System.out.println("First array items==::");
		for(int x:prices) {
			System.out.print(x+" ");
		}
		System.out.println("Maximum profit is: "+Ass.stockmarket(prices));
		
int prices2[]= {7,6,4,3,1};
System.out.println("Second array items==::");
for(int x:prices2) {
	System.out.print(x+" ");
}
		System.out.println("Maximum profit is: "+Ass.stockmarket(prices2));

	}

}
