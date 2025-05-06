package may_05;

public class Assignment_16_Strings {

	public static void main(String[] args) {
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		/* Statement:
		 * Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
1. Divide into multiple words
2. Find total number of occurrences
3. Print count and Indexes of the word
		 * 
		 * 
		 * 
		 */
			
		String[] words = paragraph.split(" ");
		for(String x:words) {
			
			System.out.println(x+ " ");
		}
		
		int count=0;
		
		for(int i=0; i<words.length;i++)
		{
			if(words[i].equalsIgnoreCase("java")) {
				
				System.out.println(words[i]+ " found at index "+ i);
			    count++;
				
			}
			
			
			
			
		}
		System.out.println("Total number of occurrences of word java is : "+count);
		
		

	}

}
