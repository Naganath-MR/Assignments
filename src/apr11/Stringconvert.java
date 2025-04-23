package apr11;

public class Stringconvert {

	public static void main(String[] args) {
		
		
		String name = "Myownvc Naowng isownuy Nyagaownat srihowarny";
		
		String wordssplit[]= name.split(" ");
		
		for(int i=0; i<wordssplit.length;i++) {
		System.out.println(wordssplit[i]+" ");
		
		}
		
		
		StringBuilder result = new StringBuilder ();
		
		System.out.println("Wordssplit arrays length:"+wordssplit.length);
		
		for(int i=0; i<wordssplit.length;i++) { //My name is Naganath // 0 1 2 3
			
		
			
		
			result.append(wordssplit[0].charAt(2)).append(" ");
			
			result.append(wordssplit[1].charAt(3)).append(" 1 ");
		
			
			
			
		}
		
		
		System.out.println(result);
		
		
	}

}
