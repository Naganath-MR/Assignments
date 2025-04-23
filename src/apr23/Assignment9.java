package apr23;
import java.util.*;

public class Assignment9 {

    public static void main(String[] args) {
    	
    	String[] empNames = {"Johnson", "Smith", "Davis","David", "Eva"};
    	double[] baseSal= {75000.0, 68000.0, 82000.0,90000.0,60000.0};
    	double[] experience= {5.1,3.2,7.1,10.2,2.4};
    	double[] rating= {4.2,3.8,4.5,2.5,3.5};
    	
    	Map<String,Double> empmap= new LinkedHashMap<String,Double>();
    	
    	for(int i=0; i<empNames.length;i++) {
    		double variablepay= 0.0 ;
			double bonus=0.0;
    		
    		
    			if(rating[i]>=4) {
    				
    				variablepay= 15.0 ;
    			    bonus=1500;
    				}
    		
    			else if(rating[i]>=3 && rating[i]<4) {
    				
        			 variablepay= 10.0 ;
        			 bonus=1200;
        				}
    		
                  else  {
    				
                	  variablepay= 3.0 ;
        			     bonus=300;
        				}
    		
               double reward =( ( experience[i] >=5.0) ? 5000 : 0);
    		
    		//To calculate hike
               
               double hikeAmount = (baseSal[i] * variablepay / 100) + bonus + reward;
           
               // To Calculate hike %
               double hikePercentage = (hikeAmount / baseSal[i]) * 100;
    	
            // To Store in map
            empmap.put(empNames[i], hikePercentage);
               
              
    	}
              for (String name : empmap.keySet()) {//To read each empnames and store it in "name" Here Key->Empname
                   double percentage = empmap.get(name); //retrieve hike % values //get method returns Empname value (IE>. Hike%)
                   System.out.println(name + ": " + String.format("%.2f", percentage) + "%");
               }
    		
    	}
    	
    	
    	
           
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

