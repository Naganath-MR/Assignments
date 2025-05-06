package may_05;

public class Assignment_15_String_Reverse {

	public static void main(String[] args) {
		/* Count the total number of words in the sentence.
		2. Print the sentence words in reverse order.
		3. Convert the first character of each word to uppercase and print original sentence
*/
		
		String sentence = "Java programming is fun and challenging";
		String[] splitted = sentence.split(" ");
		
		System.out.println("Total no.of Words in the sentence: "+splitted.length);
		
		System.out.println("====="+"Given Sentence is: ==========");
		for(String x:splitted) {
			System.out.println(x);
			}
		
		System.out.println("====== Sentence in Reverse order: =======");
		for(int i= splitted.length-1; i>=0; i--) {
			
			System.out.println(splitted[i]);
			
		}
		
	
	String Capitalized_Sentence =  " ";
	
	for(String words: splitted) {
		
		if(words.length() >0) {
			
		char Capital_Word =	Character.toUpperCase(words.charAt(0)) ; //J
		String rest_of_characters = words.substring(1)	; //ava
		Capitalized_Sentence = Capitalized_Sentence + Capital_Word + rest_of_characters+" ";
			
		}
		
		
	}
		
	System.out.println("Original sentence with First Letter Uppercase: ");
	System.out.println(Capitalized_Sentence);
		
		//To convert 2nd character of each word to uppercase
	
	String UpperCase = " ";
	
	for(String words:splitted) {
		
		
		int lengths = words.length();
		
		if(lengths > 0)   //Total - 11 - programming
		{
			
		String first = words.substring(0, lengths-2); // programmi
		char Capital = Character.toUpperCase(words.charAt(lengths-2)) ; //N
		String last = words.substring(lengths-1); //g
		 UpperCase = UpperCase+first + Capital +last+ " ";	
			
		}
		
		
	}
		
		
	System.out.println("2nd character from last of each word to uppercase is: ");	
		

	System.out.println(UpperCase);	
		
		
		
		
		
		
		
		
		
		
		
	}

}
