package apr29_Tuesday;

public class Assignment11_PowerCalc {
	
	public static void PowerCalcMethod1(double y, int z) {
		       
				
			System.out.println("The power of 2.000 equals 10: "+Math.pow(y,z)); 	
		}
	
	public static void PowerCalcMethod2(double y,int z) {
	
				
		System.out.println("The power of 2.100 equals 3: "+Math.pow(y,z)); 		
		}
	
	public static void PowerCalcMethod3(double y,int z) {
			
		System.out.println("The power of 2.00000 equals -2: "+Math.pow(y,z)); 
	}

	public static void main(String[] args) {
		PowerCalcMethod1(2.00000,10);
		PowerCalcMethod2(2.10000,3);
		PowerCalcMethod3(2.00000,-2);
	}

}
