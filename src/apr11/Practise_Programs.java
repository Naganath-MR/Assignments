package apr11;

public class Practise_Programs {

	public static void main(String[] args) {
		
		
		String name = "Welcome to Java Program";
		
		//To extract 2nd character from each words & print as output like  mtva
		
		//Step1: convert string to string array
		
     String[] words = name.split(" ");
     
     for(String s:words) {
        System.out.print(s+"\t");
 
     }
     
     StringBuilder result = new StringBuilder();
     
     for(String word:words ) {
     
       if(words.length >2) {
    	  result.append(word.charAt(word.length()-2)).append(" ");
    	   
       }
      
       }
     System.out.println("Extraced character:"+result);
	}
}

